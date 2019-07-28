package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateDeviceClaimRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
}

object InitiateDeviceClaimRequest {
  @scala.inline
  def apply(DeviceId: __string): InitiateDeviceClaimRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
  
    __obj.asInstanceOf[InitiateDeviceClaimRequest]
  }
}

