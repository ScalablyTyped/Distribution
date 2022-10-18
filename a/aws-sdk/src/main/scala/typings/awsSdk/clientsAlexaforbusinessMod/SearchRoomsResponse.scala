package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRoomsResponse extends StObject {
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The rooms that meet the specified set of filter criteria, in sort order.
    */
  var Rooms: js.UndefOr[RoomDataList] = js.undefined
  
  /**
    * The total number of rooms returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}
object SearchRoomsResponse {
  
  inline def apply(): SearchRoomsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRoomsResponse]
  }
  
  extension [Self <: SearchRoomsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRooms(value: RoomDataList): Self = StObject.set(x, "Rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsUndefined: Self = StObject.set(x, "Rooms", js.undefined)
    
    inline def setRoomsVarargs(value: RoomData*): Self = StObject.set(x, "Rooms", js.Array(value*))
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
