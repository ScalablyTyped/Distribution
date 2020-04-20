package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationScope extends js.Object {
  def kill(isHard: Boolean): Unit
}

object INotificationScope {
  @scala.inline
  def apply(kill: Boolean => Unit): INotificationScope = {
    val __obj = js.Dynamic.literal(kill = js.Any.fromFunction1(kill))
    __obj.asInstanceOf[INotificationScope]
  }
}

