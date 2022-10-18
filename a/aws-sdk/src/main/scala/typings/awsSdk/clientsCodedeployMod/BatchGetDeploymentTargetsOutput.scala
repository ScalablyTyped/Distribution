package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentTargetsOutput extends StObject {
  
  /**
    *  A list of target objects for a deployment. Each target object contains details about the target, such as its status and lifecycle events. The type of the target objects depends on the deployment' compute platform.     EC2/On-premises: Each target object is an Amazon EC2 or on-premises instance.     Lambda: The target object is a specific version of an Lambda function.     Amazon ECS: The target object is an Amazon ECS service.     CloudFormation: The target object is an CloudFormation blue/green deployment.   
    */
  var deploymentTargets: js.UndefOr[DeploymentTargetList] = js.undefined
}
object BatchGetDeploymentTargetsOutput {
  
  inline def apply(): BatchGetDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentTargetsOutput]
  }
  
  extension [Self <: BatchGetDeploymentTargetsOutput](x: Self) {
    
    inline def setDeploymentTargets(value: DeploymentTargetList): Self = StObject.set(x, "deploymentTargets", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTargetsUndefined: Self = StObject.set(x, "deploymentTargets", js.undefined)
    
    inline def setDeploymentTargetsVarargs(value: DeploymentTarget*): Self = StObject.set(x, "deploymentTargets", js.Array(value*))
  }
}
