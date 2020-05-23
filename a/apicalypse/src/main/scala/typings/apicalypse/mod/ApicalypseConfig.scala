package typings.apicalypse.mod

import typings.axios.axiosBooleans.`false`
import typings.axios.mod.AxiosBasicCredentials
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosProxyConfig
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosTransformer
import typings.axios.mod.CancelToken
import typings.axios.mod.Method
import typings.axios.mod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApicalypseConfig extends AxiosRequestConfig {
  var queryMethod: js.UndefOr[QueryMethod] = js.undefined
}

object ApicalypseConfig {
  @scala.inline
  def apply(
    adapter: /* config */ AxiosRequestConfig => AxiosPromise[js.Any] = null,
    auth: AxiosBasicCredentials = null,
    baseURL: String = null,
    cancelToken: CancelToken = null,
    data: js.Any = null,
    headers: js.Any = null,
    httpAgent: js.Any = null,
    httpsAgent: js.Any = null,
    maxContentLength: js.UndefOr[Double] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    method: Method = null,
    onDownloadProgress: /* progressEvent */ js.Any => Unit = null,
    onUploadProgress: /* progressEvent */ js.Any => Unit = null,
    params: js.Any = null,
    paramsSerializer: /* params */ js.Any => String = null,
    proxy: AxiosProxyConfig | `false` = null,
    queryMethod: QueryMethod = null,
    responseType: ResponseType = null,
    socketPath: js.UndefOr[Null | String] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timeoutErrorMessage: String = null,
    transformRequest: AxiosTransformer | js.Array[AxiosTransformer] = null,
    transformResponse: AxiosTransformer | js.Array[AxiosTransformer] = null,
    url: String = null,
    validateStatus: /* status */ Double => Boolean = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): ApicalypseConfig = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(js.Any.fromFunction1(adapter))
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (cancelToken != null) __obj.updateDynamic("cancelToken")(cancelToken.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(maxContentLength)) __obj.updateDynamic("maxContentLength")(maxContentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onDownloadProgress != null) __obj.updateDynamic("onDownloadProgress")(js.Any.fromFunction1(onDownloadProgress))
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(js.Any.fromFunction1(onUploadProgress))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(js.Any.fromFunction1(paramsSerializer))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (queryMethod != null) __obj.updateDynamic("queryMethod")(queryMethod.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(socketPath)) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timeoutErrorMessage != null) __obj.updateDynamic("timeoutErrorMessage")(timeoutErrorMessage.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApicalypseConfig]
  }
}

