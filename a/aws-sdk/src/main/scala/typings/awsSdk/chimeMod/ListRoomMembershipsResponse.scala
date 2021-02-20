package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoomMembershipsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The room membership details.
    */
  var RoomMemberships: js.UndefOr[RoomMembershipList] = js.native
}
object ListRoomMembershipsResponse {
  
  @scala.inline
  def apply(): ListRoomMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListRoomMembershipsResponseMutableBuilder[Self <: ListRoomMembershipsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRoomMemberships(value: RoomMembershipList): Self = StObject.set(x, "RoomMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomMembershipsUndefined: Self = StObject.set(x, "RoomMemberships", js.undefined)
    
    @scala.inline
    def setRoomMembershipsVarargs(value: RoomMembership*): Self = StObject.set(x, "RoomMemberships", js.Array(value :_*))
  }
}
