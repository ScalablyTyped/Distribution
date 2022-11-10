package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSummary extends StObject {
  
  /**
    * The template name.
    */
  var name: TemplateName
  
  /**
    * The status of the template.
    */
  var status: TemplateStatus
  
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var templateArn: TemplateArn
  
  /**
    * The unique identifier for the template.
    */
  var templateId: TemplateId
}
object TemplateSummary {
  
  inline def apply(name: TemplateName, status: TemplateStatus, templateArn: TemplateArn, templateId: TemplateId): TemplateSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], templateArn = templateArn.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSummary]
  }
  
  extension [Self <: TemplateSummary](x: Self) {
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TemplateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTemplateArn(value: TemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
