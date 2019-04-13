package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeviceRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
}

object DescribeDeviceRequest {
  @scala.inline
  def apply(DeviceId: __string): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
  
    __obj.asInstanceOf[DescribeDeviceRequest]
  }
}

