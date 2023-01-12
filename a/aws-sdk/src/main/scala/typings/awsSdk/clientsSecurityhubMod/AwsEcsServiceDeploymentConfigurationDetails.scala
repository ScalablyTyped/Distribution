package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceDeploymentConfigurationDetails extends StObject {
  
  /**
    * Determines whether a service deployment fails if a service cannot reach a steady state.
    */
  var DeploymentCircuitBreaker: js.UndefOr[AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails] = js.undefined
  
  /**
    * For a service that uses the rolling update (ECS) deployment type, the maximum number of tasks in a service that are allowed in the RUNNING or PENDING state during a deployment, and for tasks that use the EC2 launch type, when any container instances are in the DRAINING state. Provided as a percentage of the desired number of tasks. The default value is 200%. For a service that uses the blue/green (CODE_DEPLOY) or EXTERNAL deployment types, and tasks that use the EC2 launch type, the maximum number of tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. For the Fargate launch type, the maximum percent value is not used.
    */
  var MaximumPercent: js.UndefOr[Integer] = js.undefined
  
  /**
    * For a service that uses the rolling update (ECS) deployment type, the minimum number of tasks in a service that must remain in the RUNNING state during a deployment, and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. Expressed as a percentage of the desired number of tasks. The default value is 100%. For a service that uses the blue/green (CODE_DEPLOY) or EXTERNAL deployment types and tasks that use the EC2 launch type, the minimum number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. For the Fargate launch type, the minimum healthy percent value is not used.
    */
  var MinimumHealthyPercent: js.UndefOr[Integer] = js.undefined
}
object AwsEcsServiceDeploymentConfigurationDetails {
  
  inline def apply(): AwsEcsServiceDeploymentConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceDeploymentConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceDeploymentConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setDeploymentCircuitBreaker(value: AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails): Self = StObject.set(x, "DeploymentCircuitBreaker", value.asInstanceOf[js.Any])
    
    inline def setDeploymentCircuitBreakerUndefined: Self = StObject.set(x, "DeploymentCircuitBreaker", js.undefined)
    
    inline def setMaximumPercent(value: Integer): Self = StObject.set(x, "MaximumPercent", value.asInstanceOf[js.Any])
    
    inline def setMaximumPercentUndefined: Self = StObject.set(x, "MaximumPercent", js.undefined)
    
    inline def setMinimumHealthyPercent(value: Integer): Self = StObject.set(x, "MinimumHealthyPercent", value.asInstanceOf[js.Any])
    
    inline def setMinimumHealthyPercentUndefined: Self = StObject.set(x, "MinimumHealthyPercent", js.undefined)
  }
}
