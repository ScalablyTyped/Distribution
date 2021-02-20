package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactRoomMessageRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The message ID.
    */
  var MessageId: NonEmptyString = js.native
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}
object RedactRoomMessageRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, MessageId: NonEmptyString, RoomId: NonEmptyString): RedactRoomMessageRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactRoomMessageRequest]
  }
  
  @scala.inline
  implicit class RedactRoomMessageRequestMutableBuilder[Self <: RedactRoomMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: NonEmptyString): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
