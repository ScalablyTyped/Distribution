package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoomsResponse extends StObject {
  
  /**
    * If there are more rooms than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of the matching rooms (summary information only).
    */
  var rooms: RoomList
}
object ListRoomsResponse {
  
  inline def apply(rooms: RoomList): ListRoomsResponse = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoomsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRoomsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRooms(value: RoomList): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsVarargs(value: RoomSummary*): Self = StObject.set(x, "rooms", js.Array(value*))
  }
}
