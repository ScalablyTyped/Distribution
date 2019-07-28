package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentInstanceInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId
  /**
    *  The unique ID of an instance in the deployment group. 
    */
  var instanceId: InstanceId
}

object GetDeploymentInstanceInput {
  @scala.inline
  def apply(deploymentId: DeploymentId, instanceId: InstanceId): GetDeploymentInstanceInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId, instanceId = instanceId)
  
    __obj.asInstanceOf[GetDeploymentInstanceInput]
  }
}

