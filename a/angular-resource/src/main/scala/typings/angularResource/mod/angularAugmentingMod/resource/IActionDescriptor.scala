package typings.angularResource.mod.angularAugmentingMod.resource

import typings.angular.mod.ICacheObject
import typings.angular.mod.IHttpRequestTransformer
import typings.angular.mod.IHttpResponseTransformer
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
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cancellable)) __obj.updateDynamic("cancellable")(cancellable.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBody)) __obj.updateDynamic("hasBody")(hasBody.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (interceptor != null) __obj.updateDynamic("interceptor")(interceptor.asInstanceOf[js.Any])
    if (!js.isUndefined(isArray)) __obj.updateDynamic("isArray")(isArray.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest.asInstanceOf[js.Any])
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(transformResponse.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionDescriptor]
  }
}

