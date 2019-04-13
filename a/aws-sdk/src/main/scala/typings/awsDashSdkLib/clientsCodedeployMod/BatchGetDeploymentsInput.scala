package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentsInput extends js.Object {
  /**
    *  A list of deployment IDs, separated by spaces. 
    */
  var deploymentIds: DeploymentsList
}

object BatchGetDeploymentsInput {
  @scala.inline
  def apply(deploymentIds: DeploymentsList): BatchGetDeploymentsInput = {
    val __obj = js.Dynamic.literal(deploymentIds = deploymentIds)
  
    __obj.asInstanceOf[BatchGetDeploymentsInput]
  }
}

