package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePipeline extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service pipeline.
    */
  var arn: Arn
  
  /**
    * The time when the service pipeline was created.
    */
  var createdAt: js.Date
  
  /**
    * The deployment status of the service pipeline.
    */
  var deploymentStatus: DeploymentStatus
  
  /**
    * A service pipeline deployment status message.
    */
  var deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * The time when a deployment of the service pipeline was last attempted.
    */
  var lastDeploymentAttemptedAt: js.Date
  
  /**
    * The time when the service pipeline was last deployed successfully.
    */
  var lastDeploymentSucceededAt: js.Date
  
  /**
    * The service spec that was used to create the service pipeline.
    */
  var spec: js.UndefOr[SpecContents] = js.undefined
  
  /**
    * The major version of the service template that was used to create the service pipeline.
    */
  var templateMajorVersion: TemplateVersionPart
  
  /**
    * The minor version of the service template that was used to create the service pipeline.
    */
  var templateMinorVersion: TemplateVersionPart
  
  /**
    * The name of the service template that was used to create the service pipeline.
    */
  var templateName: ResourceName
}
object ServicePipeline {
  
  inline def apply(
    arn: Arn,
    createdAt: js.Date,
    deploymentStatus: DeploymentStatus,
    lastDeploymentAttemptedAt: js.Date,
    lastDeploymentSucceededAt: js.Date,
    templateMajorVersion: TemplateVersionPart,
    templateMinorVersion: TemplateVersionPart,
    templateName: ResourceName
  ): ServicePipeline = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], lastDeploymentAttemptedAt = lastDeploymentAttemptedAt.asInstanceOf[js.Any], lastDeploymentSucceededAt = lastDeploymentSucceededAt.asInstanceOf[js.Any], templateMajorVersion = templateMajorVersion.asInstanceOf[js.Any], templateMinorVersion = templateMinorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePipeline]
  }
  
  extension [Self <: ServicePipeline](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessage(value: StatusMessage): Self = StObject.set(x, "deploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "deploymentStatusMessage", js.undefined)
    
    inline def setLastDeploymentAttemptedAt(value: js.Date): Self = StObject.set(x, "lastDeploymentAttemptedAt", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentSucceededAt(value: js.Date): Self = StObject.set(x, "lastDeploymentSucceededAt", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
