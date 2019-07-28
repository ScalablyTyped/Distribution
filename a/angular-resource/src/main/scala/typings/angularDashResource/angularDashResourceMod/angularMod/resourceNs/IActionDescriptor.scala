package typings.angularDashResource.angularDashResourceMod.angularMod.resourceNs

import typings.angular.angularMod.ICacheObject
import typings.angular.angularMod.IHttpRequestTransformer
import typings.angular.angularMod.IHttpResponseTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Just a reference to facilitate describing new actions
trait IActionDescriptor extends js.Object {
  var cache: js.UndefOr[Boolean | ICacheObject] = js.undefined
  var cancellable: js.UndefOr[Boolean] = js.undefined
  var hasBody: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var interceptor: js.UndefOr[IResourceInterceptor] = js.undefined
  var isArray: js.UndefOr[Boolean] = js.undefined
  var method: String
  var params: js.UndefOr[js.Any] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  /**
    * Note: In contrast to $http.config, promises are not supported in $resource, because the same value
    * would be used for multiple requests. If you are looking for a way to cancel requests, you should
    * use the cancellable option.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  var transformRequest: js.UndefOr[IHttpRequestTransformer | js.Array[IHttpRequestTransformer]] = js.undefined
  var transformResponse: js.UndefOr[IHttpResponseTransformer | js.Array[IHttpResponseTransformer]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object IActionDescriptor {
  @scala.inline
  def apply(
    method: String,
    cache: Boolean | ICacheObject = null,
    cancellable: js.UndefOr[Boolean] = js.undefined,
    hasBody: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    interceptor: IResourceInterceptor = null,
    isArray: js.UndefOr[Boolean] = js.undefined,
    params: js.Any = null,
    responseType: String = null,
    timeout: Int | Double = null,
    transformRequest: IHttpRequestTransformer | js.Array[IHttpRequestTransformer] = null,
    transformResponse: IHttpResponseTransformer | js.Array[IHttpResponseTransformer] = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): IActionDescriptor = {
    val __obj = js.Dynamic.literal(method = method)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable)
    if (!js.isUndefined(hasBody)) __obj.updateDynamic("hasBody")(hasBody)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (interceptor != null) __obj.updateDynamic("interceptor")(interceptor)
    if (!js.isUndefined(isArray)) __obj.updateDynamic("isArray")(isArray)
    if (params != null) __obj.updateDynamic("params")(params)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[IActionDescriptor]
  }
}

