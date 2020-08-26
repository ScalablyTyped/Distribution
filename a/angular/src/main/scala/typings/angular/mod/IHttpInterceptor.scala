package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpInterceptor extends js.Object {
  var request: js.UndefOr[
    js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]]
  ] = js.native
  var requestError: js.UndefOr[js.Function1[/* rejection */ js.Any, IRequestConfig | IPromise[IRequestConfig]]] = js.native
  var response: js.UndefOr[
    js.Function1[/* response */ IHttpResponse[_], IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.native
  var responseError: js.UndefOr[
    js.Function1[/* rejection */ js.Any, IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.native
}

object IHttpInterceptor {
  @scala.inline
  def apply(): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpInterceptor]
  }
  @scala.inline
  implicit class IHttpInterceptorOps[Self <: IHttpInterceptor] (val x: Self) extends AnyVal {
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
    def setRequest(value: /* config */ IRequestConfig => IRequestConfig | IPromise[IRequestConfig]): Self = this.set("request", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setRequestError(value: /* rejection */ js.Any => IRequestConfig | IPromise[IRequestConfig]): Self = this.set("requestError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestError: Self = this.set("requestError", js.undefined)
    @scala.inline
    def setResponse(value: /* response */ IHttpResponse[_] => IPromise[IHttpResponse[_]] | IHttpResponse[_]): Self = this.set("response", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseError(value: /* rejection */ js.Any => IPromise[IHttpResponse[_]] | IHttpResponse[_]): Self = this.set("responseError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResponseError: Self = this.set("responseError", js.undefined)
  }
  
}

