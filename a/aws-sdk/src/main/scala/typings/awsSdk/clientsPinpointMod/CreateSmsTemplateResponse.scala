package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSmsTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typings.awsSdk.clientsPinpointMod.CreateTemplateMessageBody
}
object CreateSmsTemplateResponse {
  
  inline def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSmsTemplateResponse]
  }
  
  extension [Self <: CreateSmsTemplateResponse](x: Self) {
    
    inline def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
