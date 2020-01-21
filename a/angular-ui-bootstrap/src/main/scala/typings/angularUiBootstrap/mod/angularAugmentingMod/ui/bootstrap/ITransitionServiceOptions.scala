package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransitionServiceOptions extends js.Object {
  var animation: js.UndefOr[Boolean] = js.undefined
}

object ITransitionServiceOptions {
  @scala.inline
  def apply(animation: js.UndefOr[Boolean] = js.undefined): ITransitionServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransitionServiceOptions]
  }
}

