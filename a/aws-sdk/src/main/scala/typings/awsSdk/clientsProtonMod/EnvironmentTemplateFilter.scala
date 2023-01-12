package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentTemplateFilter extends StObject {
  
  /**
    * Include majorVersion to filter search for a major version.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * Include templateName to filter search for a template name.
    */
  var templateName: ResourceName
}
object EnvironmentTemplateFilter {
  
  inline def apply(majorVersion: TemplateVersionPart, templateName: ResourceName): EnvironmentTemplateFilter = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTemplateFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentTemplateFilter] (val x: Self) extends AnyVal {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
