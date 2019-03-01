package typings
package angularDashUiDashRouterDashDefaultLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var default: js.UndefOr[StateDefaultSpecifier] = js.undefined
}

object IState {
  @scala.inline
  def apply(default: StateDefaultSpecifier = null): IState = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

