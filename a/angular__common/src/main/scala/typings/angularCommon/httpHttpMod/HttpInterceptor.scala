package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpInterceptor extends StObject {
  
  /**
    * Identifies and handles a given HTTP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(req: HttpRequest[js.Any], next: HttpHandler): Observable_[HttpEvent[js.Any]]
}
object HttpInterceptor {
  
  inline def apply(intercept: (HttpRequest[js.Any], HttpHandler) => Observable_[HttpEvent[js.Any]]): HttpInterceptor = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction2(intercept))
    __obj.asInstanceOf[HttpInterceptor]
  }
  
  extension [Self <: HttpInterceptor](x: Self) {
    
    inline def setIntercept(value: (HttpRequest[js.Any], HttpHandler) => Observable_[HttpEvent[js.Any]]): Self = StObject.set(x, "intercept", js.Any.fromFunction2(value))
  }
}
