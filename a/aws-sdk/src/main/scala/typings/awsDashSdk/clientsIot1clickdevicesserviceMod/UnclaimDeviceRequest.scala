package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnclaimDeviceRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string = js.native
}

object UnclaimDeviceRequest {
  @scala.inline
  def apply(DeviceId: __string): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
}

