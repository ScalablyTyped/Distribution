package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRoomMembershipRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The list of membership items.
    */
  var MembershipItemList: typings.awsSdk.clientsChimeMod.MembershipItemList
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString
}
object BatchCreateRoomMembershipRequest {
  
  inline def apply(AccountId: NonEmptyString, MembershipItemList: MembershipItemList, RoomId: NonEmptyString): BatchCreateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MembershipItemList = MembershipItemList.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateRoomMembershipRequest]
  }
  
  extension [Self <: BatchCreateRoomMembershipRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMembershipItemList(value: MembershipItemList): Self = StObject.set(x, "MembershipItemList", value.asInstanceOf[js.Any])
    
    inline def setMembershipItemListVarargs(value: MembershipItem*): Self = StObject.set(x, "MembershipItemList", js.Array(value*))
    
    inline def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
