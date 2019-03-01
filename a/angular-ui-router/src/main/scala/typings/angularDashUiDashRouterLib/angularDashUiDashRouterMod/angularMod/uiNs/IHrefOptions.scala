package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHrefOptions extends js.Object {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  var lossy: js.UndefOr[scala.Boolean] = js.undefined
  var relative: js.UndefOr[IState] = js.undefined
}

object IHrefOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    inherit: js.UndefOr[scala.Boolean] = js.undefined,
    lossy: js.UndefOr[scala.Boolean] = js.undefined,
    relative: IState = null
  ): IHrefOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (!js.isUndefined(lossy)) __obj.updateDynamic("lossy")(lossy)
    if (relative != null) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[IHrefOptions]
  }
}

