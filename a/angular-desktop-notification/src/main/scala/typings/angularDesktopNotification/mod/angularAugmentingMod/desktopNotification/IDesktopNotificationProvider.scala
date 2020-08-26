package typings.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IDesktopNotificationProvider extends js.Object {
  /**
    * Set the default app-wide configuration for desktopNotification
    */
  def config(options: IDesktopNotificationOptions): Unit = js.native
}

object IDesktopNotificationProvider {
  @scala.inline
  def apply(config: IDesktopNotificationOptions => Unit): IDesktopNotificationProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
    __obj.asInstanceOf[IDesktopNotificationProvider]
  }
  @scala.inline
  implicit class IDesktopNotificationProviderOps[Self <: IDesktopNotificationProvider] (val x: Self) extends AnyVal {
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
    def setConfig(value: IDesktopNotificationOptions => Unit): Self = this.set("config", js.Any.fromFunction1(value))
  }
  
}

