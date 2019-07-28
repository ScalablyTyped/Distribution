package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentTargetsOutput extends js.Object {
  /**
    *  A list of target objects for a deployment. Each target object contains details about the target, such as its status and lifecycle events. The type of the target objects depends on the deployment' compute platform.     EC2/On-premises: Each target object is an EC2 or on-premises instance.     AWS Lambda: The target object is a specific version of an AWS Lambda function.     Amazon ECS: The target object is an Amazon ECS service.   
    */
  var deploymentTargets: js.UndefOr[DeploymentTargetList] = js.undefined
}

object BatchGetDeploymentTargetsOutput {
  @scala.inline
  def apply(deploymentTargets: DeploymentTargetList = null): BatchGetDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentTargets != null) __obj.updateDynamic("deploymentTargets")(deploymentTargets)
    __obj.asInstanceOf[BatchGetDeploymentTargetsOutput]
  }
}

