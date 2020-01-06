package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentsInput extends js.Object {
  /**
    *  A list of deployment IDs, separated by spaces. The maximum number of deployment IDs you can specify is 25.
    */
  var deploymentIds: DeploymentsList = js.native
}

object BatchGetDeploymentsInput {
  @scala.inline
  def apply(deploymentIds: DeploymentsList): BatchGetDeploymentsInput = {
    val __obj = js.Dynamic.literal(deploymentIds = deploymentIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetDeploymentsInput]
  }
}

