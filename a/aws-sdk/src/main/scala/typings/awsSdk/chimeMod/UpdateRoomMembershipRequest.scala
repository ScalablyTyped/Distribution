package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoomMembershipRequest extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The member ID.
    */
  var MemberId: NonEmptyString = js.native
  
  /**
    * The role of the member.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}
object UpdateRoomMembershipRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, MemberId: NonEmptyString, RoomId: NonEmptyString): UpdateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomMembershipRequest]
  }
  
  @scala.inline
  implicit class UpdateRoomMembershipRequestOps[Self <: UpdateRoomMembershipRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = this.set("RoomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: RoomMembershipRole): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
  }
}
