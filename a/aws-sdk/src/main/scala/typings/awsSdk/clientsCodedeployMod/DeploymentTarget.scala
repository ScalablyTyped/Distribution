package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentTarget extends StObject {
  
  var cloudFormationTarget: js.UndefOr[CloudFormationTarget] = js.undefined
  
  /**
    * The deployment type that is specific to the deployment's compute platform or deployments initiated by a CloudFormation stack update.
    */
  var deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.undefined
  
  /**
    *  Information about the target for a deployment that uses the Amazon ECS compute platform. 
    */
  var ecsTarget: js.UndefOr[ECSTarget] = js.undefined
  
  /**
    *  Information about the target for a deployment that uses the EC2/On-premises compute platform. 
    */
  var instanceTarget: js.UndefOr[InstanceTarget] = js.undefined
  
  /**
    *  Information about the target for a deployment that uses the Lambda compute platform. 
    */
  var lambdaTarget: js.UndefOr[LambdaTarget] = js.undefined
}
object DeploymentTarget {
  
  inline def apply(): DeploymentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentTarget] (val x: Self) extends AnyVal {
    
    inline def setCloudFormationTarget(value: CloudFormationTarget): Self = StObject.set(x, "cloudFormationTarget", value.asInstanceOf[js.Any])
    
    inline def setCloudFormationTargetUndefined: Self = StObject.set(x, "cloudFormationTarget", js.undefined)
    
    inline def setDeploymentTargetType(value: DeploymentTargetType): Self = StObject.set(x, "deploymentTargetType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTargetTypeUndefined: Self = StObject.set(x, "deploymentTargetType", js.undefined)
    
    inline def setEcsTarget(value: ECSTarget): Self = StObject.set(x, "ecsTarget", value.asInstanceOf[js.Any])
    
    inline def setEcsTargetUndefined: Self = StObject.set(x, "ecsTarget", js.undefined)
    
    inline def setInstanceTarget(value: InstanceTarget): Self = StObject.set(x, "instanceTarget", value.asInstanceOf[js.Any])
    
    inline def setInstanceTargetUndefined: Self = StObject.set(x, "instanceTarget", js.undefined)
    
    inline def setLambdaTarget(value: LambdaTarget): Self = StObject.set(x, "lambdaTarget", value.asInstanceOf[js.Any])
    
    inline def setLambdaTargetUndefined: Self = StObject.set(x, "lambdaTarget", js.undefined)
  }
}
