package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateRequest extends StObject {
  
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
    * A name for the template. It must be unique per domain.
    */
  var name: TemplateName
  
  /**
    * A list of fields that must contain a value for a case to be successfully created with this template.
    */
  var requiredFields: js.UndefOr[RequiredFieldList] = js.undefined
}
object CreateTemplateRequest {
  
  inline def apply(domainId: DomainId, name: TemplateName): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateRequest]
  }
  
  extension [Self <: CreateTemplateRequest](x: Self) {
    
    inline def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setLayoutConfiguration(value: LayoutConfiguration): Self = StObject.set(x, "layoutConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLayoutConfigurationUndefined: Self = StObject.set(x, "layoutConfiguration", js.undefined)
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequiredFields(value: RequiredFieldList): Self = StObject.set(x, "requiredFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredFieldsUndefined: Self = StObject.set(x, "requiredFields", js.undefined)
    
    inline def setRequiredFieldsVarargs(value: RequiredField*): Self = StObject.set(x, "requiredFields", js.Array(value*))
  }
}
