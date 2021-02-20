package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRoomsResponse extends StObject {
  
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
  implicit class SearchRoomsResponseMutableBuilder[Self <: SearchRoomsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRooms(value: RoomDataList): Self = StObject.set(x, "Rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomsUndefined: Self = StObject.set(x, "Rooms", js.undefined)
    
    @scala.inline
    def setRoomsVarargs(value: RoomData*): Self = StObject.set(x, "Rooms", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
