package typings
package angularLib.angularMod.angularNs

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
    request: js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]] = null,
    requestError: js.Function1[/* rejection */ js.Any, IRequestConfig | IPromise[IRequestConfig]] = null,
    response: js.Function1[/* response */ IHttpResponse[_], IPromise[IHttpResponse[_]] | IHttpResponse[_]] = null,
    responseError: js.Function1[/* rejection */ js.Any, IPromise[IHttpResponse[_]] | IHttpResponse[_]] = null
  ): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request)
    if (requestError != null) __obj.updateDynamic("requestError")(requestError)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseError != null) __obj.updateDynamic("responseError")(responseError)
    __obj.asInstanceOf[IHttpInterceptor]
  }
}

