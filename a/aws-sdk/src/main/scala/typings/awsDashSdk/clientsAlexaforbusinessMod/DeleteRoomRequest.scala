package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRoomRequest extends js.Object {
  /**
    * The ARN of the room to delete. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
}

object DeleteRoomRequest {
  @scala.inline
  def apply(RoomArn: Arn = null): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    __obj.asInstanceOf[DeleteRoomRequest]
  }
}

