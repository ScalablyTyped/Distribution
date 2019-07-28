package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterAVSDeviceResponse extends js.Object {
  /**
    * The ARN of the device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
}

object RegisterAVSDeviceResponse {
  @scala.inline
  def apply(DeviceArn: Arn = null): RegisterAVSDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    __obj.asInstanceOf[RegisterAVSDeviceResponse]
  }
}

