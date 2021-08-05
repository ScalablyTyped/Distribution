package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipItem extends StObject {
  
  /**
    * The member ID.
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The member role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.undefined
}
object MembershipItem {
  
  inline def apply(): MembershipItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipItem]
  }
  
  extension [Self <: MembershipItem](x: Self) {
    
    inline def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setRole(value: RoomMembershipRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
