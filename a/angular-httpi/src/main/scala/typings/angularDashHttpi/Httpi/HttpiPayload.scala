package typings.angularDashHttpi.Httpi

import typings.angular.angularMod.IHttpRequestConfigHeaders
import typings.angular.angularMod.IHttpRequestTransformer
import typings.angular.angularMod.IHttpResponseTransformer
import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpiPayload extends IRequestShortcutConfig {
  @JSName("data")
  var data_HttpiPayload: js.UndefOr[js.Object] = js.undefined
  var keepTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  @JSName("params")
  var params_HttpiPayload: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpiPayload {
  @scala.inline
  def apply(
    cache: js.Any = null,
    data: js.Object = null,
    headers: IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: String = null,
    keepTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    paramSerializer: String | (js.Function1[/* obj */ js.Any, String]) = null,
    params: js.Object = null,
    responseType: String = null,
    timeout: Double | IPromise[_] = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): HttpiPayload = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam.asInstanceOf[js.Any])
    if (!js.isUndefined(keepTrailingSlash)) __obj.updateDynamic("keepTrailingSlash")(keepTrailingSlash.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpiPayload]
  }
}

