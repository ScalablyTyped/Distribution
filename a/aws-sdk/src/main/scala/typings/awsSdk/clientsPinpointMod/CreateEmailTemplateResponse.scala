package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typings.awsSdk.clientsPinpointMod.CreateTemplateMessageBody
}
object CreateEmailTemplateResponse {
  
  inline def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailTemplateResponse]
  }
  
  extension [Self <: CreateEmailTemplateResponse](x: Self) {
    
    inline def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
