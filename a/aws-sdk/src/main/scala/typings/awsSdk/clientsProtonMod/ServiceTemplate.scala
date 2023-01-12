package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceTemplate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service template.
    */
  var arn: ServiceTemplateArn
  
  /**
    * The time when the service template was created.
    */
  var createdAt: js.Date
  
  /**
    * A description of the service template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The service template name as displayed in the developer interface.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The customer provided service template encryption key that's used to encrypt data.
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time when the service template was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The name of the service template.
    */
  var name: ResourceName
  
  /**
    * If pipelineProvisioning is true, a service pipeline is included in the service template. Otherwise, a service pipeline isn't included in the service template.
    */
  var pipelineProvisioning: js.UndefOr[Provisioning] = js.undefined
  
  /**
    * The recommended version of the service template.
    */
  var recommendedVersion: js.UndefOr[FullTemplateVersionNumber] = js.undefined
}
object ServiceTemplate {
  
  inline def apply(arn: ServiceTemplateArn, createdAt: js.Date, lastModifiedAt: js.Date, name: ResourceName): ServiceTemplate = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceTemplate] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceTemplateArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioning(value: Provisioning): Self = StObject.set(x, "pipelineProvisioning", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioningUndefined: Self = StObject.set(x, "pipelineProvisioning", js.undefined)
    
    inline def setRecommendedVersion(value: FullTemplateVersionNumber): Self = StObject.set(x, "recommendedVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedVersionUndefined: Self = StObject.set(x, "recommendedVersion", js.undefined)
  }
}
