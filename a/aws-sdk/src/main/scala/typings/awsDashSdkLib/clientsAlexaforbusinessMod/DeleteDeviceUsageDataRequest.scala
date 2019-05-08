package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeviceUsageDataRequest extends js.Object {
  /**
    * The ARN of the device.
    */
  var DeviceArn: Arn
  /**
    * The type of usage data to delete.
    */
  var DeviceUsageType: awsDashSdkLib.clientsAlexaforbusinessMod.DeviceUsageType
}

object DeleteDeviceUsageDataRequest {
  @scala.inline
  def apply(DeviceArn: Arn, DeviceUsageType: DeviceUsageType): DeleteDeviceUsageDataRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn, DeviceUsageType = DeviceUsageType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
  }
}

