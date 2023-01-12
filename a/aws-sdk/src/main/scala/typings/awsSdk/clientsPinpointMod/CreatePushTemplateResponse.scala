package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePushTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typings.awsSdk.clientsPinpointMod.CreateTemplateMessageBody
}
object CreatePushTemplateResponse {
  
  inline def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreatePushTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePushTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePushTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
