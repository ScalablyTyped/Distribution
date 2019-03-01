package typings
package angularDashUiDashNotificationLib.angularMod.uiNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationScope extends js.Object {
  def kill(isHard: scala.Boolean): scala.Unit
}

object INotificationScope {
  @scala.inline
  def apply(kill: js.Function1[scala.Boolean, scala.Unit]): INotificationScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kill")(kill)
    __obj.asInstanceOf[INotificationScope]
  }
}

