package typings.angularIdle.mod.idle

import typings.angular.mod.IRequestConfig
import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to configure the Keepalive service.
  */
@js.native
trait IKeepAliveProvider extends IServiceProvider {
  
  /**
    * If configured, options will be used to issue a request using $http.
    * If the value is null, no HTTP request will be issued.
    * You can specify a string, which it will assume to be a URL to a simple GET request.
    * Otherwise, you can use the same options $http takes. However, cache will always be false.
    *
    * @param value May be string or IRequestConfig, default is null.
    */
  def http(value: String): Unit = js.native
  def http(value: IRequestConfig): Unit = js.native
  
  /**
    * This specifies how often the keepalive event is triggered and the
    * HTTP request is issued.
    *
    * @param seconds Integer, default is 10 minutes. Must be greater than 0.
    */
  def interval(seconds: Double): Unit = js.native
}
