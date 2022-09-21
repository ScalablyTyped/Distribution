package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomMembership extends StObject {
  
  /**
    * The identifier of the user that invited the room member.
    */
  var InvitedBy: js.UndefOr[NonEmptyString] = js.undefined
  
  var Member: js.UndefOr[typings.awsSdk.chimeMod.Member] = js.undefined
  
  /**
    * The membership role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.undefined
  
  /**
    * The room ID.
    */
  var RoomId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The room membership update timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object RoomMembership {
  
  inline def apply(): RoomMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomMembership]
  }
  
  extension [Self <: RoomMembership](x: Self) {
    
    inline def setInvitedBy(value: NonEmptyString): Self = StObject.set(x, "InvitedBy", value.asInstanceOf[js.Any])
    
    inline def setInvitedByUndefined: Self = StObject.set(x, "InvitedBy", js.undefined)
    
    inline def setMember(value: Member): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    inline def setRole(value: RoomMembershipRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "RoomId", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
