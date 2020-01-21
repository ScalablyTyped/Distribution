package typings.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IDesktopNotificationOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var showOnPageHidden: js.UndefOr[Boolean] = js.undefined
}

object IDesktopNotificationOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    showOnPageHidden: js.UndefOr[Boolean] = js.undefined
  ): IDesktopNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnPageHidden)) __obj.updateDynamic("showOnPageHidden")(showOnPageHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDesktopNotificationOptions]
  }
}

