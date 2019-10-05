package typings.angularDashUiDashRouterDashUibDashModal.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var modal: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object IState {
  @scala.inline
  def apply(modal: Boolean | js.Array[String] = null): IState = {
    val __obj = js.Dynamic.literal()
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

