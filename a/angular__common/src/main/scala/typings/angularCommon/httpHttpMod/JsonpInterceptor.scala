package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "JsonpInterceptor")
@js.native
class JsonpInterceptor protected () extends StObject {
  def this(jsonp: JsonpClientBackend) = this()
  
  /**
    * Identifies and handles a given JSONP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(req: HttpRequest[js.Any], next: HttpHandler): Observable_[HttpEvent[js.Any]] = js.native
  
  var jsonp: js.Any = js.native
}
