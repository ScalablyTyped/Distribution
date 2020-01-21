package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object that controls the defaults for $http provider. Not all fields of IRequestShortcutConfig can be configured
  * via defaults and the docs do not say which. The following is based on the inspection of the source code.
  * https://docs.angularjs.org/api/ng/service/$http#defaults
  * https://docs.angularjs.org/api/ng/service/$http#usage
  * https://docs.angularjs.org/api/ng/provider/$httpProvider The properties section
  */
trait IHttpProviderDefaults extends js.Object {
  /**
    * {boolean|Cache}
    * If true, a default $http cache will be used to cache the GET request, otherwise if a cache instance built with $cacheFactory, this cache will be used for caching.
    */
  var cache: js.UndefOr[js.Any] = js.undefined
  /**
    * Map of strings or functions which return strings representing HTTP headers to send to the server. If the
    * return value of a function is null, the header will not be sent.
    * The key of the map is the request verb in lower case. The "common" key applies to all requests.
    * @see {@link https://docs.angularjs.org/api/ng/service/$http#setting-http-headers}
    */
  var headers: js.UndefOr[IHttpRequestConfigHeaders] = js.undefined
  /**
    * A function used to the prepare string representation of request parameters (specified as an object). If
    * specified as string, it is interpreted as a function registered with the $injector. Defaults to
    * $httpParamSerializer.
    */
  var paramSerializer: js.UndefOr[String | (js.Function1[/* obj */ js.Any, String])] = js.undefined
  /**
    * Transform function or an array of such functions. The transform function takes the http request body and
    * headers and returns its transformed (typically serialized) version.
    * @see {@link https://docs.angularjs.org/api/ng/service/$http#transforming-requests-and-responses}
    */
  var transformRequest: js.UndefOr[IHttpRequestTransformer | js.Array[IHttpRequestTransformer]] = js.undefined
  /**
    * Transform function or an array of such functions. The transform function takes the http response body and
    * headers and returns its transformed (typically deserialized) version.
    */
  var transformResponse: js.UndefOr[IHttpResponseTransformer | js.Array[IHttpResponseTransformer]] = js.undefined
  /**
    * whether to to set the withCredentials flag on the XHR object. See [requests with credentials]https://developer.mozilla.org/en/http_access_control#section_5 for more information.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  /** Name of cookie containing the XSRF token. */
  var xsrfCookieName: js.UndefOr[String] = js.undefined
  /** Name of HTTP header to populate with the XSRF token. */
  var xsrfHeaderName: js.UndefOr[String] = js.undefined
}

object IHttpProviderDefaults {
  @scala.inline
  def apply(
    cache: js.Any = null,
    headers: IHttpRequestConfigHeaders = null,
    paramSerializer: String | (js.Function1[/* obj */ js.Any, String]) = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xsrfCookieName: String = null,
    xsrfHeaderName: String = null
  ): IHttpProviderDefaults = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (paramSerializer != null) __obj.updateDynamic("paramSerializer")(paramSerializer.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xsrfCookieName != null) __obj.updateDynamic("xsrfCookieName")(xsrfCookieName.asInstanceOf[js.Any])
    if (xsrfHeaderName != null) __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpProviderDefaults]
  }
}

