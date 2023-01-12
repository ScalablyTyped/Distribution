package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmailTemplateRequest extends StObject {
  
  /**
    * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
    */
  var TemplateContent: EmailTemplateContent
  
  /**
    * The name of the template.
    */
  var TemplateName: EmailTemplateName
}
object UpdateEmailTemplateRequest {
  
  inline def apply(TemplateContent: EmailTemplateContent, TemplateName: EmailTemplateName): UpdateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateContent(value: EmailTemplateContent): Self = StObject.set(x, "TemplateContent", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
