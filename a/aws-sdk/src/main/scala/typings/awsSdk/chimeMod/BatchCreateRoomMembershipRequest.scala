package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateRoomMembershipRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The list of membership items.
    */
  var MembershipItemList: typings.awsSdk.chimeMod.MembershipItemList = js.native
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}
object BatchCreateRoomMembershipRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, MembershipItemList: MembershipItemList, RoomId: NonEmptyString): BatchCreateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MembershipItemList = MembershipItemList.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateRoomMembershipRequest]
  }
  
  @scala.inline
  implicit class BatchCreateRoomMembershipRequestMutableBuilder[Self <: BatchCreateRoomMembershipRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipItemList(value: MembershipItemList): Self = StObject.set(x, "MembershipItemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipItemListVarargs(value: MembershipItem*): Self = StObject.set(x, "MembershipItemList", js.Array(value :_*))
    
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
