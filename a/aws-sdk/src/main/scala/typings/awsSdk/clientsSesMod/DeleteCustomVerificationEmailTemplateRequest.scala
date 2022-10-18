package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The name of the custom verification email template that you want to delete.
    */
  var TemplateName: typings.awsSdk.clientsSesMod.TemplateName
}
object DeleteCustomVerificationEmailTemplateRequest {
  
  inline def apply(TemplateName: TemplateName): DeleteCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
  }
  
  extension [Self <: DeleteCustomVerificationEmailTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
