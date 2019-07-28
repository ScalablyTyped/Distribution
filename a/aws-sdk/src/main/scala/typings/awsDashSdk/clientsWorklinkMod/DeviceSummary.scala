package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceSummary extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[Id] = js.undefined
  /**
    * The status of the device.
    */
  var DeviceStatus: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DeviceStatus] = js.undefined
}

object DeviceSummary {
  @scala.inline
  def apply(DeviceId: Id = null, DeviceStatus: DeviceStatus = null): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    if (DeviceStatus != null) __obj.updateDynamic("DeviceStatus")(DeviceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSummary]
  }
}

