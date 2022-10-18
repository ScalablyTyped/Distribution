package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceInstanceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service instance.
    */
  var arn: ServiceInstanceArn
  
  /**
    * The time when the service instance was created.
    */
  var createdAt: js.Date
  
  /**
    * The service instance deployment status.
    */
  var deploymentStatus: DeploymentStatus
  
  /**
    * A service instance deployment status message.
    */
  var deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The name of the environment that the service instance was deployed into.
    */
  var environmentName: ResourceName
  
  /**
    * The time when a deployment of the service was last attempted.
    */
  var lastDeploymentAttemptedAt: js.Date
  
  /**
    * The time when the service was last deployed successfully.
    */
  var lastDeploymentSucceededAt: js.Date
  
  /**
    * The name of the service instance.
    */
  var name: ResourceName
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: ResourceName
  
  /**
    * The service instance template major version.
    */
  var templateMajorVersion: TemplateVersionPart
  
  /**
    * The service instance template minor version.
    */
  var templateMinorVersion: TemplateVersionPart
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object ServiceInstanceSummary {
  
  inline def apply(
    arn: ServiceInstanceArn,
    createdAt: js.Date,
    deploymentStatus: DeploymentStatus,
    environmentName: ResourceName,
    lastDeploymentAttemptedAt: js.Date,
    lastDeploymentSucceededAt: js.Date,
    name: ResourceName,
    serviceName: ResourceName,
    templateMajorVersion: TemplateVersionPart,
    templateMinorVersion: TemplateVersionPart,
    templateName: ResourceName
  ): ServiceInstanceSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], lastDeploymentAttemptedAt = lastDeploymentAttemptedAt.asInstanceOf[js.Any], lastDeploymentSucceededAt = lastDeploymentSucceededAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], templateMajorVersion = templateMajorVersion.asInstanceOf[js.Any], templateMinorVersion = templateMinorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceInstanceSummary]
  }
  
  extension [Self <: ServiceInstanceSummary](x: Self) {
    
    inline def setArn(value: ServiceInstanceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessage(value: StatusMessage): Self = StObject.set(x, "deploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "deploymentStatusMessage", js.undefined)
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentAttemptedAt(value: js.Date): Self = StObject.set(x, "lastDeploymentAttemptedAt", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentSucceededAt(value: js.Date): Self = StObject.set(x, "lastDeploymentSucceededAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
