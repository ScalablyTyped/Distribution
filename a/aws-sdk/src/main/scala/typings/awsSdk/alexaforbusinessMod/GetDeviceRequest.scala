package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceRequest extends js.Object {
  /**
    * The ARN of the device for which to request details. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}

object GetDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null): GetDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRequest]
  }
}

