package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInterceptor
  extends stdLib.Object {
  /**
    * Makes changes to the response after the request is sent, but before it's returned to the caller.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var after: js.UndefOr[AfterInterceptorCallback] = js.undefined
  /**
    * Make changes to the request URL or options before the request is sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var before: js.UndefOr[BeforeInterceptorCallback] = js.undefined
  /**
    * Sets or adds headers into `requestOptions.headers`. See also: [requestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * Sets or adds query parameters into `requestOptions.query`. See also: [requestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /**
    * Hardcodes the [response](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse). The request will not be sent. This is resolved as the response `data`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var responseData: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies the URL(s) to apply to the interceptors. If the value is type `String`, then it matches if the request URL starts with that string. If null or undefined, the interceptor will apply to all relevant requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var urls: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
}

object RequestInterceptor {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    after: AfterInterceptorCallback = null,
    before: BeforeInterceptorCallback = null,
    headers: js.Any = null,
    query: js.Any = null,
    responseData: js.Any = null,
    urls: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null
  ): RequestInterceptor = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (query != null) __obj.updateDynamic("query")(query)
    if (responseData != null) __obj.updateDynamic("responseData")(responseData)
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInterceptor]
  }
}

