package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleEnvironmentTemplateInput extends StObject {
  
  /**
    * The major version of the compatible environment template.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * The compatible environment template name.
    */
  var templateName: ResourceName
}
object CompatibleEnvironmentTemplateInput {
  
  inline def apply(majorVersion: TemplateVersionPart, templateName: ResourceName): CompatibleEnvironmentTemplateInput = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibleEnvironmentTemplateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompatibleEnvironmentTemplateInput] (val x: Self) extends AnyVal {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
