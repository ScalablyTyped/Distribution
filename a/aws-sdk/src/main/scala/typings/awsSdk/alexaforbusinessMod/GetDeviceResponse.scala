package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceResponse extends js.Object {
  /**
    * The details of the device requested. Required.
    */
  var Device: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Device] = js.native
}

object GetDeviceResponse {
  @scala.inline
  def apply(Device: Device = null): GetDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceResponse]
  }
}

