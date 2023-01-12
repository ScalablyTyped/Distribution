package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTemplateSyncConfigInput extends StObject {
  
  /**
    * The template name.
    */
  var templateName: ResourceName
  
  /**
    * The template type.
    */
  var templateType: TemplateType
}
object DeleteTemplateSyncConfigInput {
  
  inline def apply(templateName: ResourceName, templateType: TemplateType): DeleteTemplateSyncConfigInput = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateSyncConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTemplateSyncConfigInput] (val x: Self) extends AnyVal {
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
  }
}
