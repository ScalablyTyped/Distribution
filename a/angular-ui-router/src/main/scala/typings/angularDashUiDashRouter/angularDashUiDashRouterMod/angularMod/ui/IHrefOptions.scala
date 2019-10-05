package typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHrefOptions extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var inherit: js.UndefOr[Boolean] = js.undefined
  var lossy: js.UndefOr[Boolean] = js.undefined
  var relative: js.UndefOr[typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState] = js.undefined
}

object IHrefOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    lossy: js.UndefOr[Boolean] = js.undefined,
    relative: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState = null
  ): IHrefOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (!js.isUndefined(lossy)) __obj.updateDynamic("lossy")(lossy)
    if (relative != null) __obj.updateDynamic("relative")(relative)
    __obj.asInstanceOf[IHrefOptions]
  }
}

