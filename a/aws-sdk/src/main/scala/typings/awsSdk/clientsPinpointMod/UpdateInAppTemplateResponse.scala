package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInAppTemplateResponse extends StObject {
  
  var MessageBody: typings.awsSdk.clientsPinpointMod.MessageBody
}
object UpdateInAppTemplateResponse {
  
  inline def apply(MessageBody: MessageBody): UpdateInAppTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInAppTemplateResponse]
  }
  
  extension [Self <: UpdateInAppTemplateResponse](x: Self) {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
