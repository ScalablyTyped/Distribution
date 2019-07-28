package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentInstancesInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId
  /**
    * The unique IDs of instances used in the deployment. The maximum number of instance IDs you can specify is 25.
    */
  var instanceIds: InstancesList
}

object BatchGetDeploymentInstancesInput {
  @scala.inline
  def apply(deploymentId: DeploymentId, instanceIds: InstancesList): BatchGetDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId, instanceIds = instanceIds)
  
    __obj.asInstanceOf[BatchGetDeploymentInstancesInput]
  }
}

