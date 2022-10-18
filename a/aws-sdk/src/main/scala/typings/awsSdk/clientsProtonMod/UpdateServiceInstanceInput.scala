package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceInstanceInput extends StObject {
  
  /**
    * The deployment type. It defines the mode for updating a service instance, as follows:     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include major or minor version parameters when you use this deployment type.     MINOR_VERSION  In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can also specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the service instance is deployed and updated with the published, recommended (latest) major and minor version of the current template, by default. You can specify a different major version that's higher than the major version in use and a minor version.  
    */
  var deploymentType: DeploymentUpdateType
  
  /**
    * The name of the service instance to update.
    */
  var name: ResourceName
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: ResourceName
  
  /**
    * The formatted specification that defines the service instance update.
    */
  var spec: js.UndefOr[SpecContents] = js.undefined
  
  /**
    * The major version of the service template to update.
    */
  var templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The minor version of the service template to update.
    */
  var templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
}
object UpdateServiceInstanceInput {
  
  inline def apply(deploymentType: DeploymentUpdateType, name: ResourceName, serviceName: ResourceName): UpdateServiceInstanceInput = {
    val __obj = js.Dynamic.literal(deploymentType = deploymentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceInstanceInput]
  }
  
  extension [Self <: UpdateServiceInstanceInput](x: Self) {
    
    inline def setDeploymentType(value: DeploymentUpdateType): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
