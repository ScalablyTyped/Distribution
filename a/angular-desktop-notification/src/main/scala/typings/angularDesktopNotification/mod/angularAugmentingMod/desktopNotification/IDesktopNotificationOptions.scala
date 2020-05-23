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
    duration: js.UndefOr[Double] = js.undefined,
    showOnPageHidden: js.UndefOr[Boolean] = js.undefined
  ): IDesktopNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnPageHidden)) __obj.updateDynamic("showOnPageHidden")(showOnPageHidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDesktopNotificationOptions]
  }
}

