package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpInterceptor extends js.Object {
  /**
    * Identifies and handles a given HTTP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(req: HttpRequest[_], next: HttpHandler): Observable_[HttpEvent[_]] = js.native
}

object HttpInterceptor {
  @scala.inline
  def apply(intercept: (HttpRequest[_], HttpHandler) => Observable_[HttpEvent[_]]): HttpInterceptor = {
    val __obj = js.Dynamic.literal(intercept = js.Any.fromFunction2(intercept))
    __obj.asInstanceOf[HttpInterceptor]
  }
  @scala.inline
  implicit class HttpInterceptorOps[Self <: HttpInterceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIntercept(value: (HttpRequest[_], HttpHandler) => Observable_[HttpEvent[_]]): Self = this.set("intercept", js.Any.fromFunction2(value))
  }
  
}

