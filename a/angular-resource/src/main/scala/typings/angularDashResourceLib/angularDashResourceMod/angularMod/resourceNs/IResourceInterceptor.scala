package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceInterceptor extends js.Object {
  var response: js.UndefOr[js.Function1[/* response */ IResourceResponse, _]] = js.undefined
  var responseError: js.UndefOr[js.Function1[/* rejection */ js.Any, _]] = js.undefined
}

object IResourceInterceptor {
  @scala.inline
  def apply(
    response: /* response */ IResourceResponse => _ = null,
    responseError: /* rejection */ js.Any => _ = null
  ): IResourceInterceptor = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction1(response))
    if (responseError != null) __obj.updateDynamic("responseError")(js.Any.fromFunction1(responseError))
    __obj.asInstanceOf[IResourceInterceptor]
  }
}

