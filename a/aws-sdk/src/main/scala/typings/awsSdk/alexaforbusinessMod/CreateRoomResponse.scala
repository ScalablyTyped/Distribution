package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomResponse extends js.Object {
  /**
    * The ARN of the newly created room in the response.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
}

object CreateRoomResponse {
  @scala.inline
  def apply(RoomArn: Arn = null): CreateRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomResponse]
  }
}

