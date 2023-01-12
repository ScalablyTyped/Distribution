package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSyncConfigInput extends StObject {
  
  /**
    * The template name.
    */
  var templateName: ResourceName
  
  /**
    * The template type.
    */
  var templateType: TemplateType
}
object GetTemplateSyncConfigInput {
  
  inline def apply(templateName: ResourceName, templateType: TemplateType): GetTemplateSyncConfigInput = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateSyncConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateSyncConfigInput] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
  }
}
