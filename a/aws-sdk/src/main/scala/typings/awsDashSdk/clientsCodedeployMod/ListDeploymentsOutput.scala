package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentsOutput extends js.Object {
  /**
    * A list of deployment IDs.
    */
  var deployments: js.UndefOr[DeploymentsList] = js.undefined
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployments call to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeploymentsOutput {
  @scala.inline
  def apply(deployments: DeploymentsList = null, nextToken: NextToken = null): ListDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    if (deployments != null) __obj.updateDynamic("deployments")(deployments)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeploymentsOutput]
  }
}

