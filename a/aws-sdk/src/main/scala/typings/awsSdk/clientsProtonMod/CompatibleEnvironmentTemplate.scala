package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleEnvironmentTemplate extends StObject {
  
  /**
    * The major version of the compatible environment template.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * The compatible environment template name.
    */
  var templateName: ResourceName
}
object CompatibleEnvironmentTemplate {
  
  inline def apply(majorVersion: TemplateVersionPart, templateName: ResourceName): CompatibleEnvironmentTemplate = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibleEnvironmentTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompatibleEnvironmentTemplate] (val x: Self) extends AnyVal {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
