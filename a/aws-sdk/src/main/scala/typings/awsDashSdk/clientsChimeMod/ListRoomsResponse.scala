package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoomsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The room details.
    */
  var Rooms: js.UndefOr[RoomList] = js.native
}

object ListRoomsResponse {
  @scala.inline
  def apply(NextToken: String = null, Rooms: RoomList = null): ListRoomsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Rooms != null) __obj.updateDynamic("Rooms")(Rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoomsResponse]
  }
}

