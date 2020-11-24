package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HttpService
  * see http://docs.angularjs.org/api/ng/service/$http
  */
@js.native
trait IHttpService extends js.Object {
  
  /**
    * Object describing the request to be made and how it should be processed.
    */
  def apply[T](config: IRequestConfig): IHttpPromise[T] = js.native
  
  /**
    * Runtime equivalent of the $httpProvider.defaults property. Allows configuration of default headers, withCredentials as well as request and response transformations.
    */
  var defaults: IHttpProviderDefaults = js.native
  
  /**
    * Shortcut method to perform DELETE request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param config Optional configuration object
    */
  def delete[T](url: String): IHttpPromise[T] = js.native
  def delete[T](url: String, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
  
  /**
    * Shortcut method to perform GET request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param config Optional configuration object
    */
  def get[T](url: String): IHttpPromise[T] = js.native
  def get[T](url: String, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
  
  /**
    * Shortcut method to perform HEAD request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param config Optional configuration object
    */
  def head[T](url: String): IHttpPromise[T] = js.native
  def head[T](url: String, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
  
  /**
    * Shortcut method to perform JSONP request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param config Optional configuration object
    */
  def jsonp[T](url: String): IHttpPromise[T] = js.native
  def jsonp[T](url: String, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
  
  /**
    * Shortcut method to perform PATCH request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param data Request content
    * @param config Optional configuration object
    */
  def patch[T](url: String, data: js.Any): IHttpPromise[T] = js.native
  def patch[T](url: String, data: js.Any, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
  
  /**
    * Array of config objects for currently pending requests. This is primarily meant to be used for debugging purposes.
    */
  var pendingRequests: js.Array[IRequestConfig] = js.native
  
  /**
    * Shortcut method to perform POST request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param data Request content
    * @param config Optional configuration object
    */
  def post[T](url: String, data: js.Any): IHttpPromise[T] = js.native
  def post[T](url: String, data: js.Any, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
  
  /**
    * Shortcut method to perform PUT request.
    *
    * @param url Relative or absolute URL specifying the destination of the request
    * @param data Request content
    * @param config Optional configuration object
    */
  def put[T](url: String, data: js.Any): IHttpPromise[T] = js.native
  def put[T](url: String, data: js.Any, config: IRequestShortcutConfig): IHttpPromise[T] = js.native
}
