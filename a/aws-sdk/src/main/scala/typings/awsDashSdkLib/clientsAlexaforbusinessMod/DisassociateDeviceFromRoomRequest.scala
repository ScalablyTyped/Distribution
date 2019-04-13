package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateDeviceFromRoomRequest extends js.Object {
  /**
    * The ARN of the device to disassociate from a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
}

object DisassociateDeviceFromRoomRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null): DisassociateDeviceFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
  }
}

