package com.fh.baselib.http

import com.yyc.netlib.RetrofitHelper

/**
 * Author: Austin
 * Date: 2018/10/9
 * Description:
 */
class ServiceFactory {
    companion object {
        /*fun <T : Comparable<T>> getService(url: String, service: Class<T>): T {
            return RetrofitHelper.initRetrofit(url).create(service)
        }

        fun <T : Comparable<T>> getService(service: Class<T>): T {
            return RetrofitHelper.INSTANCE.retrofit.create(service)
        }*/


        fun <T> getService(service: Class<T> ): T {
            return RetrofitHelper.INSTANCE.retrofit.create(service)
        }

        fun <T> getService(url: String,service: Class<T> ): T {
            return RetrofitHelper.initRetrofit(url).create(service)
        }

    }


}