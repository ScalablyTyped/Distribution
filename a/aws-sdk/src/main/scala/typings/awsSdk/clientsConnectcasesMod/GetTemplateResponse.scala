package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateResponse extends StObject {
  
  /**
    * A brief description of the template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * Configuration of layouts associated to the template.
    */
  var layoutConfiguration: js.UndefOr[LayoutConfiguration] = js.undefined
  
  /**
    * The name of the template.
    */
  var name: TemplateName
  
  /**
    * A list of fields that must contain a value for a case to be successfully created with this template.
    */
  var requiredFields: js.UndefOr[RequiredFieldList] = js.undefined
  
  /**
    * The status of the template.
    */
  var status: TemplateStatus
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var templateArn: TemplateArn
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object GetTemplateResponse {
  
  inline def apply(name: TemplateName, status: TemplateStatus, templateArn: TemplateArn, templateId: TemplateId): GetTemplateResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], templateArn = templateArn.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateResponse]
  }
  
  extension [Self <: GetTemplateResponse](x: Self) {
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLayoutConfiguration(value: LayoutConfiguration): Self = StObject.set(x, "layoutConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLayoutConfigurationUndefined: Self = StObject.set(x, "layoutConfiguration", js.undefined)
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequiredFields(value: RequiredFieldList): Self = StObject.set(x, "requiredFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredFieldsUndefined: Self = StObject.set(x, "requiredFields", js.undefined)
    
    inline def setRequiredFieldsVarargs(value: RequiredField*): Self = StObject.set(x, "requiredFields", js.Array(value*))
    
    inline def setStatus(value: TemplateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateArn(value: TemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
