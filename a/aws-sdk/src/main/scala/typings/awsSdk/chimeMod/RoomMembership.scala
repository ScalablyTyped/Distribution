package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomMembership extends js.Object {
  
  /**
    * The identifier of the user that invited the room member.
    */
  var InvitedBy: js.UndefOr[NonEmptyString] = js.native
  
  var Member: js.UndefOr[typings.awsSdk.chimeMod.Member] = js.native
  
  /**
    * The membership role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
  
  /**
    * The room ID.
    */
  var RoomId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The room membership update timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}
object RoomMembership {
  
  @scala.inline
  def apply(): RoomMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomMembership]
  }
  
  @scala.inline
  implicit class RoomMembershipOps[Self <: RoomMembership] (val x: Self) extends AnyVal {
    
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
    def setInvitedBy(value: NonEmptyString): Self = this.set("InvitedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitedBy: Self = this.set("InvitedBy", js.undefined)
    
    @scala.inline
    def setMember(value: Member): Self = this.set("Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("Member", js.undefined)
    
    @scala.inline
    def setRole(value: RoomMembershipRole): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = this.set("RoomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomId: Self = this.set("RoomId", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
  }
}
