package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomMembershipResponse extends StObject {
  
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsSdk.clientsChimeMod.RoomMembership] = js.undefined
}
object CreateRoomMembershipResponse {
  
  inline def apply(): CreateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomMembershipResponse]
  }
  
  extension [Self <: CreateRoomMembershipResponse](x: Self) {
    
    inline def setRoomMembership(value: RoomMembership): Self = StObject.set(x, "RoomMembership", value.asInstanceOf[js.Any])
    
    inline def setRoomMembershipUndefined: Self = StObject.set(x, "RoomMembership", js.undefined)
  }
}
