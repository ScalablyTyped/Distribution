package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDeviceWithNetworkProfileRequest extends js.Object {
  /**
    * The device ARN.
    */
  var DeviceArn: Arn = js.native
  /**
    * The ARN of the network profile to associate with a device.
    */
  var NetworkProfileArn: Arn = js.native
}

object AssociateDeviceWithNetworkProfileRequest {
  @scala.inline
  def apply(DeviceArn: Arn, NetworkProfileArn: Arn): AssociateDeviceWithNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDeviceWithNetworkProfileRequest]
  }
}

