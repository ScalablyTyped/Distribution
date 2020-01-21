package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomRequest extends js.Object {
  /**
    * The ARN of the room to delete. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object DeleteRoomRequest {
  @scala.inline
  def apply(RoomArn: Arn = null): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomRequest]
  }
}

