package typings.angularCommon.httpMod

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
  def intercept(req: HttpRequest[Any], next: HttpHandler): Observable_[HttpEvent[Any]]
}
object HttpInterceptor {
  
  inline def apply(intercept: (HttpRequest[Any], HttpHandler) => Observable_[HttpEvent[Any]]): HttpInterceptor = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction2(intercept))
    __obj.asInstanceOf[HttpInterceptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpInterceptor] (val x: Self) extends AnyVal {
    
    inline def setIntercept(value: (HttpRequest[Any], HttpHandler) => Observable_[HttpEvent[Any]]): Self = StObject.set(x, "intercept", js.Any.fromFunction2(value))
  }
}
