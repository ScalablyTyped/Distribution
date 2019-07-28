package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing the request to be made and how it should be processed.
  * see http://docs.angularjs.org/api/ng/service/$http#usage
  */
trait IRequestShortcutConfig extends IHttpProviderDefaults {
  /**
    * {string|Object}
    * Data to be sent as the request message data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Name of the parameter added (by AngularJS) to the request to specify the name (in the server response) of the JSON-P callback to invoke.
    * If unspecified, $http.defaults.jsonpCallbackParam will be used by default. This property is only applicable to JSON-P requests.
    */
  var jsonpCallbackParam: js.UndefOr[String] = js.undefined
  /**
    * {Object.<string|Object>}
    * Map of strings or objects which will be turned to ?key1=value1&key2=value2 after the url. If the value is not a string, it will be JSONified.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * See [XMLHttpRequest.responseType]https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest#xmlhttprequest-responsetype
    */
  var responseType: js.UndefOr[String] = js.undefined
  /**
    * Timeout in milliseconds, or promise that should abort the request when resolved.
    */
  var timeout: js.UndefOr[Double | IPromise[_]] = js.undefined
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(
    cache: js.Any = null,
    data: js.Any = null,
    headers: IHttpRequestConfigHeaders = null,
    jsonpCallbackParam: String = null,
    paramSerializer: String | (js.Function1[/* obj */ js.Any, String]) = null,
    params: js.Any = null,
    responseType: String = null,
    timeout: Double | IPromise[_] = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (jsonpCallbackParam != null) __obj.updateDynamic("jsonpCallbackParam")(jsonpCallbackParam)
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
}

