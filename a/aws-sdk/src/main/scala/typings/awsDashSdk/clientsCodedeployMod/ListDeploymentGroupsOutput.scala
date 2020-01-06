package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentGroupsOutput extends js.Object {
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * A list of deployment group names.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment groups call to return the next set of deployment groups in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentGroupsOutput {
  @scala.inline
  def apply(
    applicationName: ApplicationName = null,
    deploymentGroups: DeploymentGroupsList = null,
    nextToken: NextToken = null
  ): ListDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (deploymentGroups != null) __obj.updateDynamic("deploymentGroups")(deploymentGroups.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentGroupsOutput]
  }
}

