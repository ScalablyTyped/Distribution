package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceTemplateVersionInput extends StObject {
  
  /**
    * The service template major version to delete.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * The service template minor version to delete.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object DeleteServiceTemplateVersionInput {
  
  inline def apply(majorVersion: TemplateVersionPart, minorVersion: TemplateVersionPart, templateName: ResourceName): DeleteServiceTemplateVersionInput = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceTemplateVersionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceTemplateVersionInput] (val x: Self) extends AnyVal {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
