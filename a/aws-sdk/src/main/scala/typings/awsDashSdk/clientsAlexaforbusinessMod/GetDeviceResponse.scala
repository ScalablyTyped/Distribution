package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceResponse extends js.Object {
  /**
    * The details of the device requested. Required.
    */
  var Device: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Device] = js.native
}

object GetDeviceResponse {
  @scala.inline
  def apply(Device: Device = null): GetDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceResponse]
  }
}

