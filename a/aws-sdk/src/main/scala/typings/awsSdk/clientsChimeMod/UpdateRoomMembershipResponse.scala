package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoomMembershipResponse extends StObject {
  
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsSdk.clientsChimeMod.RoomMembership] = js.undefined
}
object UpdateRoomMembershipResponse {
  
  inline def apply(): UpdateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomMembershipResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRoomMembershipResponse] (val x: Self) extends AnyVal {
    
    inline def setRoomMembership(value: RoomMembership): Self = StObject.set(x, "RoomMembership", value.asInstanceOf[js.Any])
    
    inline def setRoomMembershipUndefined: Self = StObject.set(x, "RoomMembership", js.undefined)
  }
}
