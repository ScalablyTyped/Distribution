package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.ui.bootstrap

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
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    __obj.asInstanceOf[ITransitionServiceOptions]
  }
}

