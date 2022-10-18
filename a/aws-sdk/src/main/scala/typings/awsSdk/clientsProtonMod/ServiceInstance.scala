package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceInstance extends StObject {
  
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
    * The message associated with the service instance deployment status.
    */
  var deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The name of the environment that the service instance was deployed into.
    */
  var environmentName: ResourceName
  
  /**
    * The time when a deployment of the service instance was last attempted.
    */
  var lastDeploymentAttemptedAt: js.Date
  
  /**
    * The time when the service instance was last deployed successfully.
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
    * The service spec that was used to create the service instance.
    */
  var spec: js.UndefOr[SpecContents] = js.undefined
  
  /**
    * The major version of the service template that was used to create the service instance.
    */
  var templateMajorVersion: TemplateVersionPart
  
  /**
    * The minor version of the service template that was used to create the service instance.
    */
  var templateMinorVersion: TemplateVersionPart
  
  /**
    * The name of the service template that was used to create the service instance.
    */
  var templateName: ResourceName
}
object ServiceInstance {
  
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
  ): ServiceInstance = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], lastDeploymentAttemptedAt = lastDeploymentAttemptedAt.asInstanceOf[js.Any], lastDeploymentSucceededAt = lastDeploymentSucceededAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], templateMajorVersion = templateMajorVersion.asInstanceOf[js.Any], templateMinorVersion = templateMinorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceInstance]
  }
  
  extension [Self <: ServiceInstance](x: Self) {
    
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
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
