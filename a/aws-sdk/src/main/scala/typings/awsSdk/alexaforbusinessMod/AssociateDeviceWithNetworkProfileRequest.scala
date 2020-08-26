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
  @scala.inline
  implicit class AssociateDeviceWithNetworkProfileRequestOps[Self <: AssociateDeviceWithNetworkProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceArn(value: Arn): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkProfileArn(value: Arn): Self = this.set("NetworkProfileArn", value.asInstanceOf[js.Any])
  }
  
}

