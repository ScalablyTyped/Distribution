package typings.atAngularCommon.httpHttpMod

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpInterceptor extends js.Object {
  /**
    * Identifies and handles a given HTTP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(req: HttpRequest[_], next: HttpHandler): Observable[HttpEvent[_]]
}

object HttpInterceptor {
  @scala.inline
  def apply(intercept: (HttpRequest[_], HttpHandler) => Observable[HttpEvent[_]]): HttpInterceptor = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction2(intercept))
  
    __obj.asInstanceOf[HttpInterceptor]
  }
}

