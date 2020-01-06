package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomResponse extends js.Object {
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsDashSdk.clientsChimeMod.Room] = js.native
}

object UpdateRoomResponse {
  @scala.inline
  def apply(Room: Room = null): UpdateRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (Room != null) __obj.updateDynamic("Room")(Room.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomResponse]
  }
}

