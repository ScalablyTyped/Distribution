package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDeviceWithRoomRequest extends js.Object {
  /**
    * The ARN of the device to associate to a room. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the room with which to associate the device. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object AssociateDeviceWithRoomRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null, RoomArn: Arn = null): AssociateDeviceWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
  }
}

