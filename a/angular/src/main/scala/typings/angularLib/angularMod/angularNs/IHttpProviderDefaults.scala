package typings
package angularLib.angularMod.angularNs

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
  var paramSerializer: js.UndefOr[java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String])] = js.undefined
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
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of cookie containing the XSRF token. */
  var xsrfCookieName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of HTTP header to populate with the XSRF token. */
  var xsrfHeaderName: js.UndefOr[java.lang.String] = js.undefined
}

