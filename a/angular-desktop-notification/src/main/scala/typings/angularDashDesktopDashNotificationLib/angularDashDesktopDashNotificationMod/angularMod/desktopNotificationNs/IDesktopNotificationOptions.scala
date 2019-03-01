package typings
package angularDashDesktopDashNotificationLib.angularDashDesktopDashNotificationMod.angularMod.desktopNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IDesktopNotificationOptions extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var showOnPageHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object IDesktopNotificationOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    showOnPageHidden: js.UndefOr[scala.Boolean] = js.undefined
  ): IDesktopNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnPageHidden)) __obj.updateDynamic("showOnPageHidden")(showOnPageHidden)
    __obj.asInstanceOf[IDesktopNotificationOptions]
  }
}

