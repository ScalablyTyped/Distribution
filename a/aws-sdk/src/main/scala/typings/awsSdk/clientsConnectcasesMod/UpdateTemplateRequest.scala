package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateRequest extends StObject {
  
  /**
    * A brief description of the template.
    */
  var description: js.UndefOr[TemplateDescription] = js.undefined
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * Configuration of layouts associated to the template.
    */
  var layoutConfiguration: js.UndefOr[LayoutConfiguration] = js.undefined
  
  /**
    * The name of the template. It must be unique per domain.
    */
  var name: js.UndefOr[TemplateName] = js.undefined
  
  /**
    * A list of fields that must contain a value for a case to be successfully created with this template.
    */
  var requiredFields: js.UndefOr[RequiredFieldList] = js.undefined
  
  /**
    * The status of the template.
    */
  var status: js.UndefOr[TemplateStatus] = js.undefined
  
  /**
    * A unique identifier for the template.
    */
  var templateId: TemplateId
}
object UpdateTemplateRequest {
  
  inline def apply(domainId: DomainId, templateId: TemplateId): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
  
  extension [Self <: UpdateTemplateRequest](x: Self) {
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setLayoutConfiguration(value: LayoutConfiguration): Self = StObject.set(x, "layoutConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLayoutConfigurationUndefined: Self = StObject.set(x, "layoutConfiguration", js.undefined)
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequiredFields(value: RequiredFieldList): Self = StObject.set(x, "requiredFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredFieldsUndefined: Self = StObject.set(x, "requiredFields", js.undefined)
    
    inline def setRequiredFieldsVarargs(value: RequiredField*): Self = StObject.set(x, "requiredFields", js.Array(value*))
    
    inline def setStatus(value: TemplateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
