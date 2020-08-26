package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Device extends js.Object {
  /**
    * Represents actual device location such as latitude, longitude, and
    * formatted address. Requires the
    * DEVICE_COARSE_LOCATION
    * or
    * DEVICE_PRECISE_LOCATION
    * permission.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
}

object GoogleActionsV2Device {
  @scala.inline
  def apply(): GoogleActionsV2Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Device]
  }
  @scala.inline
  implicit class GoogleActionsV2DeviceOps[Self <: GoogleActionsV2Device] (val x: Self) extends AnyVal {
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
    def setLocation(value: GoogleActionsV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

