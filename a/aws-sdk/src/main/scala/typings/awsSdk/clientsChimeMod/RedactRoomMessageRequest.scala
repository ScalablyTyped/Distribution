package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedactRoomMessageRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The message ID.
    */
  var MessageId: NonEmptyString
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString
}
object RedactRoomMessageRequest {
  
  inline def apply(AccountId: NonEmptyString, MessageId: NonEmptyString, RoomId: NonEmptyString): RedactRoomMessageRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedactRoomMessageRequest]
  }
  
  extension [Self <: RedactRoomMessageRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: NonEmptyString): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
