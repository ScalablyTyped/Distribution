package typings
package angularDashUiDashNotificationLib.angularMod.uiNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationProvider extends js.Object {
  def setOptions(options: IGlobalMessageOptions): scala.Unit
}

object INotificationProvider {
  @scala.inline
  def apply(setOptions: js.Function1[IGlobalMessageOptions, scala.Unit]): INotificationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setOptions")(setOptions)
    __obj.asInstanceOf[INotificationProvider]
  }
}

