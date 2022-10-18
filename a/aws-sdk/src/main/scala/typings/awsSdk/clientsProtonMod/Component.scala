package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: ComponentArn
  
  /**
    * The time when the component was created.
    */
  var createdAt: js.Date
  
  /**
    * The component deployment status.
    */
  var deploymentStatus: DeploymentStatus
  
  /**
    * The message associated with the component deployment status.
    */
  var deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined
  
  /**
    * A description of the component.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the Proton environment that this component is associated with.
    */
  var environmentName: ResourceName
  
  /**
    * The time when a deployment of the component was last attempted.
    */
  var lastDeploymentAttemptedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the component was last deployed successfully.
    */
  var lastDeploymentSucceededAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the component was last modified.
    */
  var lastModifiedAt: js.Date
  
  /**
    * The name of the component.
    */
  var name: ResourceName
  
  /**
    * The name of the service instance that this component is attached to. Provided when a component is attached to a service instance.
    */
  var serviceInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the service that serviceInstanceName is associated with. Provided when a component is attached to a service instance.
    */
  var serviceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The service spec that the component uses to access service inputs. Provided when a component is attached to a service instance.
    */
  var serviceSpec: js.UndefOr[SpecContents] = js.undefined
}
object Component {
  
  inline def apply(
    arn: ComponentArn,
    createdAt: js.Date,
    deploymentStatus: DeploymentStatus,
    environmentName: ResourceName,
    lastModifiedAt: js.Date,
    name: ResourceName
  ): Component = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], lastModifiedAt = lastModifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setArn(value: ComponentArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessage(value: StatusMessage): Self = StObject.set(x, "deploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "deploymentStatusMessage", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentAttemptedAt(value: js.Date): Self = StObject.set(x, "lastDeploymentAttemptedAt", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentAttemptedAtUndefined: Self = StObject.set(x, "lastDeploymentAttemptedAt", js.undefined)
    
    inline def setLastDeploymentSucceededAt(value: js.Date): Self = StObject.set(x, "lastDeploymentSucceededAt", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentSucceededAtUndefined: Self = StObject.set(x, "lastDeploymentSucceededAt", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceSpec(value: SpecContents): Self = StObject.set(x, "serviceSpec", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecUndefined: Self = StObject.set(x, "serviceSpec", js.undefined)
  }
}
