package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentConfigsOutput extends js.Object {
  /**
    * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
    */
  var deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment configurations call to return the next set of deployment configurations in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeploymentConfigsOutput {
  @scala.inline
  def apply(deploymentConfigsList: DeploymentConfigsList = null, nextToken: NextToken = null): ListDeploymentConfigsOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfigsList != null) __obj.updateDynamic("deploymentConfigsList")(deploymentConfigsList)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeploymentConfigsOutput]
  }
}

