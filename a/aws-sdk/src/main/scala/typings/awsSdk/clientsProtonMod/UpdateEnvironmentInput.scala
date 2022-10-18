package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined components in this environment. It determines the scope of infrastructure that a component can provision. The environment must have a componentRoleArn to allow directly defined components to be associated with the environment. For more information about components, see Proton components in the Proton User Guide.
    */
  var componentRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * There are four modes for updating an environment. The deploymentType field defines the mode.     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated.     CURRENT_VERSION  In this mode, the environment is deployed and updated with the new spec that you provide. Only requested parameters are updated. Don’t include major or minor version parameters when you use this deployment-type.     MINOR_VERSION  In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of the current major version in use, by default. You can also specify a different minor version of the current major version in use.     MAJOR_VERSION  In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor version of the current template, by default. You can also specify a different major version that is higher than the major version in use and a minor version (optional).  
    */
  var deploymentType: DeploymentUpdateType
  
  /**
    * A description of the environment update.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the environment account connection. You can only update to a new environment account connection if it was created in the same environment account that the current environment account connection was created in and is associated with the current environment.
    */
  var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined
  
  /**
    * The name of the environment to update.
    */
  var name: ResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make API calls to other services your behalf.
    */
  var protonServiceRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The linked repository that you use to host your rendered infrastructure templates for self-managed provisioning. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository.
    */
  var provisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined
  
  /**
    * The formatted specification that defines the update.
    */
  var spec: js.UndefOr[SpecContents] = js.undefined
  
  /**
    * The major version of the environment to update.
    */
  var templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The minor version of the environment to update.
    */
  var templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
}
object UpdateEnvironmentInput {
  
  inline def apply(deploymentType: DeploymentUpdateType, name: ResourceName): UpdateEnvironmentInput = {
    val __obj = js.Dynamic.literal(deploymentType = deploymentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentInput]
  }
  
  extension [Self <: UpdateEnvironmentInput](x: Self) {
    
    inline def setComponentRoleArn(value: Arn): Self = StObject.set(x, "componentRoleArn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArnUndefined: Self = StObject.set(x, "componentRoleArn", js.undefined)
    
    inline def setDeploymentType(value: DeploymentUpdateType): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentAccountConnectionId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "environmentAccountConnectionId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentAccountConnectionIdUndefined: Self = StObject.set(x, "environmentAccountConnectionId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtonServiceRoleArn(value: Arn): Self = StObject.set(x, "protonServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setProtonServiceRoleArnUndefined: Self = StObject.set(x, "protonServiceRoleArn", js.undefined)
    
    inline def setProvisioningRepository(value: RepositoryBranchInput): Self = StObject.set(x, "provisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setProvisioningRepositoryUndefined: Self = StObject.set(x, "provisioningRepository", js.undefined)
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
