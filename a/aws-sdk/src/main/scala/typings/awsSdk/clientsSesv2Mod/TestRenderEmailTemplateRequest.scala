package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRenderEmailTemplateRequest extends StObject {
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: EmailTemplateData
  
  /**
    * The name of the template.
    */
  var TemplateName: EmailTemplateName
}
object TestRenderEmailTemplateRequest {
  
  inline def apply(TemplateData: EmailTemplateData, TemplateName: EmailTemplateName): TestRenderEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderEmailTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestRenderEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateData(value: EmailTemplateData): Self = StObject.set(x, "TemplateData", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
