package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoomMembershipRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: NonEmptyString
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString
}
object DeleteRoomMembershipRequest {
  
  inline def apply(AccountId: NonEmptyString, MemberId: NonEmptyString, RoomId: NonEmptyString): DeleteRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomMembershipRequest]
  }
  
  extension [Self <: DeleteRoomMembershipRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
