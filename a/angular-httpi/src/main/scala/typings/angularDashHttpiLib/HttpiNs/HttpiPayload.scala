package typings
package angularDashHttpiLib.HttpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpiPayload
  extends angularLib.angularMod.IRequestShortcutConfig {
  @JSName("data")
  var data_HttpiPayload: js.UndefOr[js.Object] = js.undefined
  var keepTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  @JSName("params")
  var params_HttpiPayload: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object HttpiPayload {
  @scala.inline
  def apply(
    cache: js.Any = null,
    data: js.Object = null,
    headers: angularLib.angularMod.IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: java.lang.String = null,
    keepTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    paramSerializer: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String]) = null,
    params: js.Object = null,
    responseType: java.lang.String = null,
    timeout: scala.Double | angularLib.angularMod.IPromise[_] = null,
    transformRequest: angularLib.angularMod.IHttpRequestTransformer | js.Array[angularLib.angularMod.IHttpRequestTransformer] = null,
    transformResponse: angularLib.angularMod.IHttpResponseTransformer | js.Array[angularLib.angularMod.IHttpResponseTransformer] = null,
    url: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xsrfCookieName: java.lang.String = null,
    xsrfHeaderName: java.lang.String = null
  ): HttpiPayload = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam)
    if (!js.isUndefined(keepTrailingSlash)) __obj.updateDynamic("keepTrailingSlash")(keepTrailingSlash)
    if (method != null) __obj.updateDynamic("method")(method)
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[HttpiPayload]
  }
}

