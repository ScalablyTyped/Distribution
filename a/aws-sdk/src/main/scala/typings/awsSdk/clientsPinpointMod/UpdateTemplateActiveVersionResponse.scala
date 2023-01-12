package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateActiveVersionResponse extends StObject {
  
  var MessageBody: typings.awsSdk.clientsPinpointMod.MessageBody
}
object UpdateTemplateActiveVersionResponse {
  
  inline def apply(MessageBody: MessageBody): UpdateTemplateActiveVersionResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateActiveVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTemplateActiveVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
