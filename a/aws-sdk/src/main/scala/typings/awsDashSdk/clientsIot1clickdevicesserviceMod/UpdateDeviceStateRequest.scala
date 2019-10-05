package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceStateRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
  /**
    * If true, the device is enabled. If false, the device is
    disabled.
    */
  var Enabled: js.UndefOr[__boolean] = js.undefined
}

object UpdateDeviceStateRequest {
  @scala.inline
  def apply(DeviceId: __string, Enabled: js.UndefOr[Boolean] = js.undefined): UpdateDeviceStateRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[UpdateDeviceStateRequest]
  }
}

