package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomResponse extends js.Object {
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.chimeMod.Room] = js.native
}

object GetRoomResponse {
  @scala.inline
  def apply(Room: Room = null): GetRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (Room != null) __obj.updateDynamic("Room")(Room.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomResponse]
  }
}

