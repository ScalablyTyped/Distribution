package typings.atAngularHttp.srcHttpMod

import typings.atAngularHttp.srcBaseUnderscoreRequestUnderscoreOptionsMod.RequestOptions
import typings.atAngularHttp.srcInterfacesMod.ConnectionBackend
import typings.atAngularHttp.srcInterfacesMod.RequestOptionsArgs
import typings.atAngularHttp.srcStaticUnderscoreRequestMod.Request
import typings.atAngularHttp.srcStaticUnderscoreResponseMod.Response
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/http", "Http")
@js.native
class Http protected () extends js.Object {
  def this(_backend: ConnectionBackend, _defaultOptions: RequestOptions) = this()
  var _backend: ConnectionBackend = js.native
  var _defaultOptions: RequestOptions = js.native
  /**
    * Performs a request with `delete` http method.
    */
  def delete(url: String): Observable[Response] = js.native
  def delete(url: String, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs a request with `get` http method.
    */
  def get(url: String): Observable[Response] = js.native
  def get(url: String, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs a request with `head` http method.
    */
  def head(url: String): Observable[Response] = js.native
  def head(url: String, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs a request with `options` http method.
    */
  def options(url: String): Observable[Response] = js.native
  def options(url: String, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs a request with `patch` http method.
    */
  def patch(url: String, body: js.Any): Observable[Response] = js.native
  def patch(url: String, body: js.Any, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs a request with `post` http method.
    */
  def post(url: String, body: js.Any): Observable[Response] = js.native
  def post(url: String, body: js.Any, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs a request with `put` http method.
    */
  def put(url: String, body: js.Any): Observable[Response] = js.native
  def put(url: String, body: js.Any, options: RequestOptionsArgs): Observable[Response] = js.native
  /**
    * Performs any type of http request. First argument is required, and can either be a url or
    * a {@link Request} instance. If the first argument is a url, an optional {@link RequestOptions}
    * object can be provided as the 2nd argument. The options object will be merged with the values
    * of {@link BaseRequestOptions} before performing the request.
    */
  def request(url: String): Observable[Response] = js.native
  def request(url: String, options: RequestOptionsArgs): Observable[Response] = js.native
  def request(url: Request): Observable[Response] = js.native
  def request(url: Request, options: RequestOptionsArgs): Observable[Response] = js.native
}

