package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRenderTemplateRequest extends StObject {
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: typings.awsSdk.clientsSesMod.TemplateData
  
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: typings.awsSdk.clientsSesMod.TemplateName
}
object TestRenderTemplateRequest {
  
  inline def apply(TemplateData: TemplateData, TemplateName: TemplateName): TestRenderTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestRenderTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setTemplateData(value: TemplateData): Self = StObject.set(x, "TemplateData", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
