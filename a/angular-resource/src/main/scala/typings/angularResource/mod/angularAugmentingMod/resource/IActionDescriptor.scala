package typings.angularResource.mod.angularAugmentingMod.resource

import typings.angular.mod.ICacheObject
import typings.angular.mod.IHttpHeadersGetter
import typings.angular.mod.IHttpRequestTransformer
import typings.angular.mod.IHttpResponseTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Just a reference to facilitate describing new actions
@js.native
trait IActionDescriptor extends js.Object {
  var cache: js.UndefOr[Boolean | ICacheObject] = js.native
  var cancellable: js.UndefOr[Boolean] = js.native
  var hasBody: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var interceptor: js.UndefOr[IResourceInterceptor] = js.native
  var isArray: js.UndefOr[Boolean] = js.native
  var method: String = js.native
  var params: js.UndefOr[js.Any] = js.native
  var responseType: js.UndefOr[String] = js.native
  /**
    * Note: In contrast to $http.config, promises are not supported in $resource, because the same value
    * would be used for multiple requests. If you are looking for a way to cancel requests, you should
    * use the cancellable option.
    */
  var timeout: js.UndefOr[Double] = js.native
  var transformRequest: js.UndefOr[IHttpRequestTransformer | js.Array[IHttpRequestTransformer]] = js.native
  var transformResponse: js.UndefOr[IHttpResponseTransformer | js.Array[IHttpResponseTransformer]] = js.native
  var url: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IActionDescriptor {
  @scala.inline
  def apply(method: String): IActionDescriptor = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionDescriptor]
  }
  @scala.inline
  implicit class IActionDescriptorOps[Self <: IActionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean | ICacheObject): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCancellable(value: Boolean): Self = this.set("cancellable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancellable: Self = this.set("cancellable", js.undefined)
    @scala.inline
    def setHasBody(value: Boolean): Self = this.set("hasBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBody: Self = this.set("hasBody", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInterceptor(value: IResourceInterceptor): Self = this.set("interceptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterceptor: Self = this.set("interceptor", js.undefined)
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTransformRequestVarargs(value: IHttpRequestTransformer*): Self = this.set("transformRequest", js.Array(value :_*))
    @scala.inline
    def setTransformRequestFunction2(value: (/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter) => js.Any): Self = this.set("transformRequest", js.Any.fromFunction2(value))
    @scala.inline
    def setTransformRequest(value: IHttpRequestTransformer | js.Array[IHttpRequestTransformer]): Self = this.set("transformRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    @scala.inline
    def setTransformResponseVarargs(value: IHttpResponseTransformer*): Self = this.set("transformResponse", js.Array(value :_*))
    @scala.inline
    def setTransformResponseFunction3(value: (/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter, /* status */ Double) => js.Any): Self = this.set("transformResponse", js.Any.fromFunction3(value))
    @scala.inline
    def setTransformResponse(value: IHttpResponseTransformer | js.Array[IHttpResponseTransformer]): Self = this.set("transformResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformResponse: Self = this.set("transformResponse", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

