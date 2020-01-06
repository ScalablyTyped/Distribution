package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentConfigsOutput extends js.Object {
  /**
    * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
    */
  var deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment configurations call to return the next set of deployment configurations in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentConfigsOutput {
  @scala.inline
  def apply(deploymentConfigsList: DeploymentConfigsList = null, nextToken: NextToken = null): ListDeploymentConfigsOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfigsList != null) __obj.updateDynamic("deploymentConfigsList")(deploymentConfigsList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentConfigsOutput]
  }
}

