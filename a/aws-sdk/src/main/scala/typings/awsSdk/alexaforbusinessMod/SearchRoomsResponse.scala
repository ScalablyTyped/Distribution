package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchRoomsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The rooms that meet the specified set of filter criteria, in sort order.
    */
  var Rooms: js.UndefOr[RoomDataList] = js.native
  /**
    * The total number of rooms returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchRoomsResponse {
  @scala.inline
  def apply(): SearchRoomsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRoomsResponse]
  }
  @scala.inline
  implicit class SearchRoomsResponseOps[Self <: SearchRoomsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRoomsVarargs(value: RoomData*): Self = this.set("Rooms", js.Array(value :_*))
    @scala.inline
    def setRooms(value: RoomDataList): Self = this.set("Rooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRooms: Self = this.set("Rooms", js.undefined)
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

