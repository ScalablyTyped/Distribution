package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoomMembershipRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The Amazon Chime member ID (user ID or bot ID).
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
object CreateRoomMembershipRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, MemberId: NonEmptyString, RoomId: NonEmptyString): CreateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomMembershipRequest]
  }
  
  @scala.inline
  implicit class CreateRoomMembershipRequestMutableBuilder[Self <: CreateRoomMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: RoomMembershipRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
