package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoomMembershipsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The room membership details.
    */
  var RoomMemberships: js.UndefOr[RoomMembershipList] = js.undefined
}
object ListRoomMembershipsResponse {
  
  inline def apply(): ListRoomMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomMembershipsResponse]
  }
  
  extension [Self <: ListRoomMembershipsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoomMemberships(value: RoomMembershipList): Self = StObject.set(x, "RoomMemberships", value.asInstanceOf[js.Any])
    
    inline def setRoomMembershipsUndefined: Self = StObject.set(x, "RoomMemberships", js.undefined)
    
    inline def setRoomMembershipsVarargs(value: RoomMembership*): Self = StObject.set(x, "RoomMemberships", js.Array(value*))
  }
}
