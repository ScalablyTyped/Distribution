package typings.angularUiRouter.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHrefOptions extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var inherit: js.UndefOr[Boolean] = js.undefined
  var lossy: js.UndefOr[Boolean] = js.undefined
  var relative: js.UndefOr[IState] = js.undefined
}

object IHrefOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    lossy: js.UndefOr[Boolean] = js.undefined,
    relative: IState = null
  ): IHrefOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (!js.isUndefined(lossy)) __obj.updateDynamic("lossy")(lossy.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHrefOptions]
  }
}

