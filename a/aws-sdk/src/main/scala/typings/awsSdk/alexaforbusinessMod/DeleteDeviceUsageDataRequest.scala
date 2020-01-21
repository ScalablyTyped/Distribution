package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceUsageDataRequest extends js.Object {
  /**
    * The ARN of the device.
    */
  var DeviceArn: Arn = js.native
  /**
    * The type of usage data to delete.
    */
  var DeviceUsageType: typings.awsSdk.alexaforbusinessMod.DeviceUsageType = js.native
}

object DeleteDeviceUsageDataRequest {
  @scala.inline
  def apply(DeviceArn: Arn, DeviceUsageType: DeviceUsageType): DeleteDeviceUsageDataRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], DeviceUsageType = DeviceUsageType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
  }
}

