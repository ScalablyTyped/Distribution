package typings
package angularDashUiDashRouterDashUibDashModalLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var modal: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

object IState {
  @scala.inline
  def apply(modal: scala.Boolean | js.Array[java.lang.String] = null): IState = {
    val __obj = js.Dynamic.literal()
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

