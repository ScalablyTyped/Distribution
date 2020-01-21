package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpInterceptor extends js.Object {
  var request: js.UndefOr[
    js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]]
  ] = js.undefined
  var requestError: js.UndefOr[js.Function1[/* rejection */ js.Any, IRequestConfig | IPromise[IRequestConfig]]] = js.undefined
  var response: js.UndefOr[
    js.Function1[/* response */ IHttpResponse[_], IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.undefined
  var responseError: js.UndefOr[
    js.Function1[/* rejection */ js.Any, IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.undefined
}

object IHttpInterceptor {
  @scala.inline
  def apply(
    request: /* config */ IRequestConfig => IRequestConfig | IPromise[IRequestConfig] = null,
    requestError: /* rejection */ js.Any => IRequestConfig | IPromise[IRequestConfig] = null,
    response: /* response */ IHttpResponse[_] => IPromise[IHttpResponse[_]] | IHttpResponse[_] = null,
    responseError: /* rejection */ js.Any => IPromise[IHttpResponse[_]] | IHttpResponse[_] = null
  ): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (requestError != null) __obj.updateDynamic("requestError")(js.Any.fromFunction1(requestError))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction1(response))
    if (responseError != null) __obj.updateDynamic("responseError")(js.Any.fromFunction1(responseError))
    __obj.asInstanceOf[IHttpInterceptor]
  }
}

