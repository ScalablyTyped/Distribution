package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.  If applicationName is specified, then deploymentGroupName must be specified. If it is not specified, then deploymentGroupName must not be specified.  
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  /**
    * A time range (start and end) for returning a subset of the list of deployments.
    */
  var createTimeRange: js.UndefOr[TimeRange] = js.undefined
  /**
    * The name of a deployment group for the specified application.  If deploymentGroupName is specified, then applicationName must be specified. If it is not specified, then applicationName must not be specified.  
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
  /**
    * A subset of deployments to list by status:   Created: Include created deployments in the resulting list.   Queued: Include queued deployments in the resulting list.   In Progress: Include in-progress deployments in the resulting list.   Succeeded: Include successful deployments in the resulting list.   Failed: Include failed deployments in the resulting list.   Stopped: Include stopped deployments in the resulting list.  
    */
  var includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined
  /**
    * An identifier returned from the previous list deployments call. It can be used to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeploymentsInput {
  @scala.inline
  def apply(
    applicationName: ApplicationName = null,
    createTimeRange: TimeRange = null,
    deploymentGroupName: DeploymentGroupName = null,
    includeOnlyStatuses: DeploymentStatusList = null,
    nextToken: NextToken = null
  ): ListDeploymentsInput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (createTimeRange != null) __obj.updateDynamic("createTimeRange")(createTimeRange)
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName)
    if (includeOnlyStatuses != null) __obj.updateDynamic("includeOnlyStatuses")(includeOnlyStatuses)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeploymentsInput]
  }
}

