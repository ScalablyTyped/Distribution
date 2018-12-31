package typings
package atAngularHttpLib.srcHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/http", "Http")
@js.native
class Http protected () extends js.Object {
  def this(_backend: atAngularHttpLib.srcInterfacesMod.ConnectionBackend, _defaultOptions: atAngularHttpLib.srcBaseUnderscoreRequestUnderscoreOptionsMod.RequestOptions) = this()
  var _backend: atAngularHttpLib.srcInterfacesMod.ConnectionBackend = js.native
  var _defaultOptions: atAngularHttpLib.srcBaseUnderscoreRequestUnderscoreOptionsMod.RequestOptions = js.native
  /**
    * Performs a request with `delete` http method.
    */
  def delete(url: java.lang.String): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def delete(url: java.lang.String, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs a request with `get` http method.
    */
  def get(url: java.lang.String): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def get(url: java.lang.String, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs a request with `head` http method.
    */
  def head(url: java.lang.String): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def head(url: java.lang.String, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs a request with `options` http method.
    */
  def options(url: java.lang.String): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def options(url: java.lang.String, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs a request with `patch` http method.
    */
  def patch(url: java.lang.String, body: js.Any): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def patch(url: java.lang.String, body: js.Any, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs a request with `post` http method.
    */
  def post(url: java.lang.String, body: js.Any): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def post(url: java.lang.String, body: js.Any, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs a request with `put` http method.
    */
  def put(url: java.lang.String, body: js.Any): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def put(url: java.lang.String, body: js.Any, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def request(url: atAngularHttpLib.srcStaticUnderscoreRequestMod.Request): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def request(
    url: atAngularHttpLib.srcStaticUnderscoreRequestMod.Request,
    options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs
  ): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
    * Performs any type of http request. First argument is required, and can either be a url or
    * a {@link Request} instance. If the first argument is a url, an optional {@link RequestOptions}
    * object can be provided as the 2nd argument. The options object will be merged with the values
    * of {@link BaseRequestOptions} before performing the request.
    */
  def request(url: java.lang.String): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def request(url: java.lang.String, options: atAngularHttpLib.srcInterfacesMod.RequestOptionsArgs): rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
}

