package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Device extends js.Object {
  /**
    * Represents actual device location such as latitude, longitude, and
    * formatted address. Requires the
    * DEVICE_COARSE_LOCATION
    * or
    * DEVICE_PRECISE_LOCATION
    * permission.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
}

object GoogleActionsV2Device {
  @scala.inline
  def apply(location: GoogleActionsV2Location = null): GoogleActionsV2Device = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2Device]
  }
}

