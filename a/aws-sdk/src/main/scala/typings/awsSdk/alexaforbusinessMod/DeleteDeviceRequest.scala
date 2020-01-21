package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeviceRequest extends js.Object {
  /**
    * The ARN of the device for which to request details.
    */
  var DeviceArn: Arn = js.native
}

object DeleteDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
}

