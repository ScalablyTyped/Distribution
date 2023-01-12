package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var arn: EnvironmentArn
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined components in this environment. It determines the scope of infrastructure that a component can provision. The environment must have a componentRoleArn to allow directly defined components to be associated with the environment. For more information about components, see Proton components in the Proton User Guide.
    */
  var componentRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time when the environment was created.
    */
  var createdAt: js.Date
  
  /**
    * The environment deployment status.
    */
  var deploymentStatus: DeploymentStatus
  
  /**
    * An environment deployment status message.
    */
  var deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The description of the environment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the environment account connection that the environment is associated with.
    */
  var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined
  
  /**
    * The ID of the environment account that the environment infrastructure resources are provisioned in.
    */
  var environmentAccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The time when a deployment of the environment was last attempted.
    */
  var lastDeploymentAttemptedAt: js.Date
  
  /**
    * The time when the environment was last deployed successfully.
    */
  var lastDeploymentSucceededAt: js.Date
  
  /**
    * The name of the environment.
    */
  var name: ResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other services on your behalf.
    */
  var protonServiceRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
    */
  var provisioning: js.UndefOr[Provisioning] = js.undefined
  
  /**
    * The major version of the environment template.
    */
  var templateMajorVersion: TemplateVersionPart
  
  /**
    * The minor version of the environment template.
    */
  var templateMinorVersion: TemplateVersionPart
  
  /**
    * The name of the environment template.
    */
  var templateName: ResourceName
}
object EnvironmentSummary {
  
  inline def apply(
    arn: EnvironmentArn,
    createdAt: js.Date,
    deploymentStatus: DeploymentStatus,
    lastDeploymentAttemptedAt: js.Date,
    lastDeploymentSucceededAt: js.Date,
    name: ResourceName,
    templateMajorVersion: TemplateVersionPart,
    templateMinorVersion: TemplateVersionPart,
    templateName: ResourceName
  ): EnvironmentSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], lastDeploymentAttemptedAt = lastDeploymentAttemptedAt.asInstanceOf[js.Any], lastDeploymentSucceededAt = lastDeploymentSucceededAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateMajorVersion = templateMajorVersion.asInstanceOf[js.Any], templateMinorVersion = templateMinorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EnvironmentArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArn(value: Arn): Self = StObject.set(x, "componentRoleArn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArnUndefined: Self = StObject.set(x, "componentRoleArn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessage(value: StatusMessage): Self = StObject.set(x, "deploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "deploymentStatusMessage", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentAccountConnectionId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "environmentAccountConnectionId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentAccountConnectionIdUndefined: Self = StObject.set(x, "environmentAccountConnectionId", js.undefined)
    
    inline def setEnvironmentAccountId(value: AwsAccountId): Self = StObject.set(x, "environmentAccountId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentAccountIdUndefined: Self = StObject.set(x, "environmentAccountId", js.undefined)
    
    inline def setLastDeploymentAttemptedAt(value: js.Date): Self = StObject.set(x, "lastDeploymentAttemptedAt", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentSucceededAt(value: js.Date): Self = StObject.set(x, "lastDeploymentSucceededAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtonServiceRoleArn(value: Arn): Self = StObject.set(x, "protonServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setProtonServiceRoleArnUndefined: Self = StObject.set(x, "protonServiceRoleArn", js.undefined)
    
    inline def setProvisioning(value: Provisioning): Self = StObject.set(x, "provisioning", value.asInstanceOf[js.Any])
    
    inline def setProvisioningUndefined: Self = StObject.set(x, "provisioning", js.undefined)
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
