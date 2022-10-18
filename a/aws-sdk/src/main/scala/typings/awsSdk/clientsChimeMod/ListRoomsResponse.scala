package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoomsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The room details.
    */
  var Rooms: js.UndefOr[RoomList] = js.undefined
}
object ListRoomsResponse {
  
  inline def apply(): ListRoomsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomsResponse]
  }
  
  extension [Self <: ListRoomsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRooms(value: RoomList): Self = StObject.set(x, "Rooms", value.asInstanceOf[js.Any])
    
    inline def setRoomsUndefined: Self = StObject.set(x, "Rooms", js.undefined)
    
    inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "Rooms", js.Array(value*))
  }
}
