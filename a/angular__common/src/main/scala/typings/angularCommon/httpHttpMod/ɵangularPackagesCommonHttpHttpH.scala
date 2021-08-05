package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "\u0275angular_packages_common_http_http_h")
@js.native
class ɵangularPackagesCommonHttpHttpH protected ()
  extends StObject
     with HttpInterceptor {
  def this(tokenService: HttpXsrfTokenExtractor, headerName: String) = this()
  
  /* private */ var headerName: js.Any = js.native
  
  /**
    * Identifies and handles a given HTTP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  /* CompleteClass */
  override def intercept(req: HttpRequest[js.Any], next: HttpHandler): Observable_[HttpEvent[js.Any]] = js.native
  
  /* private */ var tokenService: js.Any = js.native
}
