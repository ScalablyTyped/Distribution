package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchRoomsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The rooms that meet the specified set of filter criteria, in sort order.
    */
  var Rooms: js.UndefOr[RoomDataList] = js.undefined
  /**
    * The total number of rooms returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}

object SearchRoomsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Rooms: RoomDataList = null, TotalCount: Int | Double = null): SearchRoomsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Rooms != null) __obj.updateDynamic("Rooms")(Rooms)
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRoomsResponse]
  }
}

