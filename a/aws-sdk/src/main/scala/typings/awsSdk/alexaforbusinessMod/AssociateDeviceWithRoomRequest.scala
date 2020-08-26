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
  def apply(): AssociateDeviceWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
  }
  @scala.inline
  implicit class AssociateDeviceWithRoomRequestOps[Self <: AssociateDeviceWithRoomRequest] (val x: Self) extends AnyVal {
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
    def deleteDeviceArn: Self = this.set("DeviceArn", js.undefined)
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
  }
  
}

