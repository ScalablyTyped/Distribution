package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterAVSDeviceResponse extends js.Object {
  /**
    * The ARN of the device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}

object RegisterAVSDeviceResponse {
  @scala.inline
  def apply(DeviceArn: Arn = null): RegisterAVSDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAVSDeviceResponse]
  }
}

