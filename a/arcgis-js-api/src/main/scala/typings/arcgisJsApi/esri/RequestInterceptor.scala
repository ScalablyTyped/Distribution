package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInterceptor extends Object {
  /**
    * Makes changes to the response after the request is sent, but before it's returned to the caller.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var after: js.UndefOr[AfterInterceptorCallback] = js.undefined
  /**
    * Make changes to the request URL or options before the request is sent. A returned value will be used as the response data, which would prevent the request from being sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var before: js.UndefOr[BeforeInterceptorCallback] = js.undefined
  /**
    * When an error occurs during the request processing, this function is called with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) object giving the details about what happened. For example, this could be used to log specific errors occurring with layers or services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var error: js.UndefOr[ErrorCallback] = js.undefined
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
  var urls: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
}

object RequestInterceptor {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    after: /* response */ RequestResponse => Unit = null,
    before: /* params */ js.Any => js.Any = null,
    error: /* error */ Error => Unit = null,
    headers: js.Any = null,
    query: js.Any = null,
    responseData: js.Any = null,
    urls: String | RegExp | (js.Array[String | RegExp]) = null
  ): RequestInterceptor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (responseData != null) __obj.updateDynamic("responseData")(responseData.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInterceptor]
  }
}

