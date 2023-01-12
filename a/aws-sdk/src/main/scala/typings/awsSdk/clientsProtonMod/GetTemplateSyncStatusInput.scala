package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSyncStatusInput extends StObject {
  
  /**
    * The template name.
    */
  var templateName: ResourceName
  
  /**
    * The template type.
    */
  var templateType: TemplateType
  
  /**
    * The template major version.
    */
  var templateVersion: TemplateVersionPart
}
object GetTemplateSyncStatusInput {
  
  inline def apply(templateName: ResourceName, templateType: TemplateType, templateVersion: TemplateVersionPart): GetTemplateSyncStatusInput = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any], templateVersion = templateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateSyncStatusInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateSyncStatusInput] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateVersion", value.asInstanceOf[js.Any])
  }
}
