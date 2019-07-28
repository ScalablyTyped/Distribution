package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceResponse extends js.Object {
  /**
    * The details of the device requested. Required.
    */
  var Device: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Device] = js.undefined
}

object GetDeviceResponse {
  @scala.inline
  def apply(Device: Device = null): GetDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device)
    __obj.asInstanceOf[GetDeviceResponse]
  }
}

