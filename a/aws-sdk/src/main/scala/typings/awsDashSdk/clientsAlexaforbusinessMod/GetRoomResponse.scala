package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoomResponse extends js.Object {
  /**
    * The details of the room requested.
    */
  var Room: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Room] = js.undefined
}

object GetRoomResponse {
  @scala.inline
  def apply(Room: Room = null): GetRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (Room != null) __obj.updateDynamic("Room")(Room)
    __obj.asInstanceOf[GetRoomResponse]
  }
}

