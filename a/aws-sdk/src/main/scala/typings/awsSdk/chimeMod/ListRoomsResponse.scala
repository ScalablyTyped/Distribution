package typings.awsSdk.chimeMod

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
  
  @scala.inline
  def apply(): ListRoomsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomsResponse]
  }
  
  @scala.inline
  implicit class ListRoomsResponseMutableBuilder[Self <: ListRoomsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRooms(value: RoomList): Self = StObject.set(x, "Rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomsUndefined: Self = StObject.set(x, "Rooms", js.undefined)
    
    @scala.inline
    def setRoomsVarargs(value: Room*): Self = StObject.set(x, "Rooms", js.Array(value :_*))
  }
}
