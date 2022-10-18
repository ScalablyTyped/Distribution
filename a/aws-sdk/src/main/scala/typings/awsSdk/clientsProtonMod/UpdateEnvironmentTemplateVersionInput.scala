package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentTemplateVersionInput extends StObject {
  
  /**
    * A description of environment template version to update.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * To update a major version of an environment template, include major Version.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * To update a minor version of an environment template, include minorVersion.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The status of the environment template minor version to update.
    */
  var status: js.UndefOr[TemplateVersionStatus] = js.undefined
  
  /**
    * The name of the environment template.
    */
  var templateName: ResourceName
}
object UpdateEnvironmentTemplateVersionInput {
  
  inline def apply(majorVersion: TemplateVersionPart, minorVersion: TemplateVersionPart, templateName: ResourceName): UpdateEnvironmentTemplateVersionInput = {
    val __obj = js.Dynamic.literal(majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentTemplateVersionInput]
  }
  
  extension [Self <: UpdateEnvironmentTemplateVersionInput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TemplateVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
