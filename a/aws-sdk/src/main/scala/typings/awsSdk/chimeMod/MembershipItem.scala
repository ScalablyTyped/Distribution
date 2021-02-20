package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipItem extends StObject {
  
  /**
    * The member ID.
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The member role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
}
object MembershipItem {
  
  @scala.inline
  def apply(): MembershipItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipItem]
  }
  
  @scala.inline
  implicit class MembershipItemMutableBuilder[Self <: MembershipItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    @scala.inline
    def setRole(value: RoomMembershipRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
