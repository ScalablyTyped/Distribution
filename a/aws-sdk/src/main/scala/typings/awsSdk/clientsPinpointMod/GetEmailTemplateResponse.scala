package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailTemplateResponse extends StObject {
  
  var EmailTemplateResponse: typings.awsSdk.clientsPinpointMod.EmailTemplateResponse
}
object GetEmailTemplateResponse {
  
  inline def apply(EmailTemplateResponse: EmailTemplateResponse): GetEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(EmailTemplateResponse = EmailTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEmailTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setEmailTemplateResponse(value: EmailTemplateResponse): Self = StObject.set(x, "EmailTemplateResponse", value.asInstanceOf[js.Any])
  }
}
