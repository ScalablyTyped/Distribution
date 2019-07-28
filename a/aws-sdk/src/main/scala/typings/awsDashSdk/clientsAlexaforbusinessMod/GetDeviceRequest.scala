package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceRequest extends js.Object {
  /**
    * The ARN of the device for which to request details. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
}

object GetDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null): GetDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    __obj.asInstanceOf[GetDeviceRequest]
  }
}

