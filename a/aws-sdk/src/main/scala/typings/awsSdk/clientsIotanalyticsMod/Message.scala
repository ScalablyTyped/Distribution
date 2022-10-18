package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The ID you want to assign to the message. Each messageId must be unique within each batch sent.
    */
  var messageId: MessageId
  
  /**
    * The payload of the message. This can be a JSON string or a base64-encoded string representing binary data, in which case you must decode it by means of a pipeline activity.
    */
  var payload: MessagePayload
}
object Message {
  
  inline def apply(messageId: MessageId, payload: MessagePayload): Message = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: MessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
