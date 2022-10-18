package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The name of the custom verification email template that you want to retrieve.
    */
  var TemplateName: EmailTemplateName
}
object GetCustomVerificationEmailTemplateRequest {
  
  inline def apply(TemplateName: EmailTemplateName): GetCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
  }
  
  extension [Self <: GetCustomVerificationEmailTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
