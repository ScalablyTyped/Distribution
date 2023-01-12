package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceTemplateVersionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the version of a service template.
    */
  var arn: ServiceTemplateVersionArn
  
  /**
    * The time when the version of a service template was created.
    */
  var createdAt: js.Date
  
  /**
    * A description of the version of a service template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The time when the version of a service template was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The latest major version that's associated with the version of a service template.
    */
  var majorVersion: TemplateVersionPart
  
  /**
    * The minor version of a service template.
    */
  var minorVersion: TemplateVersionPart
  
  /**
    * The recommended minor version of the service template.
    */
  var recommendedMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The service template minor version status.
    */
  var status: TemplateVersionStatus
  
  /**
    * A service template minor version status message.
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object ServiceTemplateVersionSummary {
  
  inline def apply(
    arn: ServiceTemplateVersionArn,
    createdAt: js.Date,
    lastModifiedAt: js.Date,
    majorVersion: TemplateVersionPart,
    minorVersion: TemplateVersionPart,
    status: TemplateVersionStatus,
    templateName: ResourceName
  ): ServiceTemplateVersionSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTemplateVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceTemplateVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceTemplateVersionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "recommendedMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedMinorVersionUndefined: Self = StObject.set(x, "recommendedMinorVersion", js.undefined)
    
    inline def setStatus(value: TemplateVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
