package typings.awsDashSdk.clientsAlexaforbusinessMod

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
  def apply(RoomArn: Arn = null): GetRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomRequest]
  }
}

