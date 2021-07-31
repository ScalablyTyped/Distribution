package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomMembershipResponse extends StObject {
  
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsSdk.chimeMod.RoomMembership] = js.undefined
}
object CreateRoomMembershipResponse {
  
  @scala.inline
  def apply(): CreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomMembershipResponse]
  }
  
  @scala.inline
  implicit class CreateRoomMembershipResponseMutableBuilder[Self <: CreateRoomMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomMembership(value: RoomMembership): Self = StObject.set(x, "RoomMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomMembershipUndefined: Self = StObject.set(x, "RoomMembership", js.undefined)
  }
}
