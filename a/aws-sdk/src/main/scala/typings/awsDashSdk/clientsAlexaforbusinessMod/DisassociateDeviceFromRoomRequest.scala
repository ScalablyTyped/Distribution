package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateDeviceFromRoomRequest extends js.Object {
  /**
    * The ARN of the device to disassociate from a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}

object DisassociateDeviceFromRoomRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null): DisassociateDeviceFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
  }
}

