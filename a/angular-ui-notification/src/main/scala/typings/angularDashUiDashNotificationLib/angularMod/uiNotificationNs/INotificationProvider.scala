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
  def apply(setOptions: IGlobalMessageOptions => scala.Unit): INotificationProvider = {
    val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[INotificationProvider]
  }
}

