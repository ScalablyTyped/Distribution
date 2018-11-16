package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Used to configure the Keepalive service.
         */
@js.native
trait IKeepAliveProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
               * If configured, options will be used to issue a request using $http.
               * If the value is null, no HTTP request will be issued.
               * You can specify a string, which it will assume to be a URL to a simple GET request.
               * Otherwise, you can use the same options $http takes. However, cache will always be false.
               *
               * @param value May be string or IRequestConfig, default is null.
               */
  def http(value: angularLib.angularMod.angularNs.IRequestConfig): scala.Unit = js.native
  /**
               * If configured, options will be used to issue a request using $http.
               * If the value is null, no HTTP request will be issued.
               * You can specify a string, which it will assume to be a URL to a simple GET request.
               * Otherwise, you can use the same options $http takes. However, cache will always be false.
               *
               * @param value May be string or IRequestConfig, default is null.
               */
  def http(value: java.lang.String): scala.Unit = js.native
  /**
               * This specifies how often the keepalive event is triggered and the
               * HTTP request is issued.
               *
               * @param seconds Integer, default is 10 minutes. Must be greater than 0.
               */
  def interval(seconds: scala.Double): scala.Unit = js.native
}

