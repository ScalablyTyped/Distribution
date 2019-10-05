package typings.angularDashUiDashNotification.angularMod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationProvider extends js.Object {
  def setOptions(options: IGlobalMessageOptions): Unit
}

object INotificationProvider {
  @scala.inline
  def apply(setOptions: IGlobalMessageOptions => Unit): INotificationProvider = {
    val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[INotificationProvider]
  }
}

