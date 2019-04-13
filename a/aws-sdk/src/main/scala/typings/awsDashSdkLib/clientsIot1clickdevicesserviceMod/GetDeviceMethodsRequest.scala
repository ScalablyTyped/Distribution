package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceMethodsRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
}

object GetDeviceMethodsRequest {
  @scala.inline
  def apply(DeviceId: __string): GetDeviceMethodsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
  
    __obj.asInstanceOf[GetDeviceMethodsRequest]
  }
}

