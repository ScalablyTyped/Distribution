package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeviceRequest extends js.Object {
  /**
    * The ARN of the device for which to request details.
    */
  var DeviceArn: Arn
}

object DeleteDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn): DeleteDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn)
  
    __obj.asInstanceOf[DeleteDeviceRequest]
  }
}

