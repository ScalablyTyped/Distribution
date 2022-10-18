package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.clientsPinpointMod.MessageBody
}
object DeleteVoiceTemplateResponse {
  
  inline def apply(MessageBody: MessageBody): DeleteVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceTemplateResponse]
  }
  
  extension [Self <: DeleteVoiceTemplateResponse](x: Self) {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
