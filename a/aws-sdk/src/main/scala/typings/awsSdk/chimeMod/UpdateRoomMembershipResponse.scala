package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoomMembershipResponse extends StObject {
  
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsSdk.chimeMod.RoomMembership] = js.undefined
}
object UpdateRoomMembershipResponse {
  
  inline def apply(): UpdateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomMembershipResponse]
  }
  
  extension [Self <: UpdateRoomMembershipResponse](x: Self) {
    
    inline def setRoomMembership(value: RoomMembership): Self = StObject.set(x, "RoomMembership", value.asInstanceOf[js.Any])
    
    inline def setRoomMembershipUndefined: Self = StObject.set(x, "RoomMembership", js.undefined)
  }
}
