package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "JsonpInterceptor")
@js.native
class JsonpInterceptor protected () extends js.Object {
  def this(jsonp: JsonpClientBackend) = this()
  var jsonp: js.Any = js.native
  /**
    * Identifies and handles a given JSONP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(req: HttpRequest[_], next: HttpHandler): Observable_[HttpEvent[_]] = js.native
}

