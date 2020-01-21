package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceRequest extends js.Object {
  /**
    * The ARN of the device to update. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * The updated device name. Required.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeviceName] = js.native
}

object UpdateDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null, DeviceName: DeviceName = null): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
}

