package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnclaimDeviceRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
}

object UnclaimDeviceRequest {
  @scala.inline
  def apply(DeviceId: __string): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
  
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
}

