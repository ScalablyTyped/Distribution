package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipItem extends js.Object {
  
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
  implicit class MembershipItemOps[Self <: MembershipItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberId: Self = this.set("MemberId", js.undefined)
    
    @scala.inline
    def setRole(value: RoomMembershipRole): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
  }
}
