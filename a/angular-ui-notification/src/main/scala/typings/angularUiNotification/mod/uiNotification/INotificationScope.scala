package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationScope extends js.Object {
  def kill(isHard: Boolean): Unit = js.native
}

object INotificationScope {
  @scala.inline
  def apply(kill: Boolean => Unit): INotificationScope = {
    val __obj = js.Dynamic.literal(kill = js.Any.fromFunction1(kill))
    __obj.asInstanceOf[INotificationScope]
  }
  @scala.inline
  implicit class INotificationScopeOps[Self <: INotificationScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKill(value: Boolean => Unit): Self = this.set("kill", js.Any.fromFunction1(value))
  }
  
}

