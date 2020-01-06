package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceMethodsRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string = js.native
}

object GetDeviceMethodsRequest {
  @scala.inline
  def apply(DeviceId: __string): GetDeviceMethodsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeviceMethodsRequest]
  }
}

