package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentInput extends js.Object {
  /**
    *  The unique ID of a deployment associated with the IAM user or AWS account. 
    */
  var deploymentId: DeploymentId
}

object GetDeploymentInput {
  @scala.inline
  def apply(deploymentId: DeploymentId): GetDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId)
  
    __obj.asInstanceOf[GetDeploymentInput]
  }
}

