package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.clientsPinpointMod.MessageBody
}
object UpdateEmailTemplateResponse {
  
  inline def apply(MessageBody: MessageBody): UpdateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateResponse]
  }
  
  extension [Self <: UpdateEmailTemplateResponse](x: Self) {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
