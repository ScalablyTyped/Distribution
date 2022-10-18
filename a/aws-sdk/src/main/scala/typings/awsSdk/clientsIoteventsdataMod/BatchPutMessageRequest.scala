package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutMessageRequest extends StObject {
  
  /**
    * The list of messages to send. Each message has the following format: '{ "messageId": "string", "inputName": "string", "payload": "string"}' 
    */
  var messages: Messages
}
object BatchPutMessageRequest {
  
  inline def apply(messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
  
  extension [Self <: BatchPutMessageRequest](x: Self) {
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
