package typings
package angularDashDesktopDashNotificationLib.angularDashDesktopDashNotificationMod.angularMod.desktopNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IDesktopNotificationProvider extends js.Object {
  /**
    * Set the default app-wide configuration for desktopNotification
    */
  def config(options: IDesktopNotificationOptions): scala.Unit
}

object IDesktopNotificationProvider {
  @scala.inline
  def apply(config: js.Function1[IDesktopNotificationOptions, scala.Unit]): IDesktopNotificationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[IDesktopNotificationProvider]
  }
}

