package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomRequest extends js.Object {
  /**
    * The ARN of the room for which to request details. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object GetRoomRequest {
  @scala.inline
  def apply(): GetRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomRequest]
  }
  @scala.inline
  implicit class GetRoomRequestOps[Self <: GetRoomRequest] (val x: Self) extends AnyVal {
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
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
  }
  
}

