package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Just a reference to facilitate describing new actions
trait IActionDescriptor extends js.Object {
  var cache: js.UndefOr[scala.Boolean | angularLib.angularMod.angularNs.ICacheObject] = js.undefined
  var cancellable: js.UndefOr[scala.Boolean] = js.undefined
  var hasBody: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var interceptor: js.UndefOr[IResourceInterceptor] = js.undefined
  var isArray: js.UndefOr[scala.Boolean] = js.undefined
  var method: java.lang.String
  var params: js.UndefOr[js.Any] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Note: In contrast to $http.config, promises are not supported in $resource, because the same value
    * would be used for multiple requests. If you are looking for a way to cancel requests, you should
    * use the cancellable option.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transformRequest: js.UndefOr[
    angularLib.angularMod.angularNs.IHttpRequestTransformer | js.Array[angularLib.angularMod.angularNs.IHttpRequestTransformer]
  ] = js.undefined
  var transformResponse: js.UndefOr[
    angularLib.angularMod.angularNs.IHttpResponseTransformer | js.Array[angularLib.angularMod.angularNs.IHttpResponseTransformer]
  ] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

