package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDeviceWithNetworkProfileRequest extends js.Object {
  /**
    * The device ARN.
    */
  var DeviceArn: Arn
  /**
    * The ARN of the network profile to associate with a device.
    */
  var NetworkProfileArn: Arn
}

object AssociateDeviceWithNetworkProfileRequest {
  @scala.inline
  def apply(DeviceArn: Arn, NetworkProfileArn: Arn): AssociateDeviceWithNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn, NetworkProfileArn = NetworkProfileArn)
  
    __obj.asInstanceOf[AssociateDeviceWithNetworkProfileRequest]
  }
}

