package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentJobsResponse extends js.Object {
  /**
    * A list of deployment jobs that meet the criteria of the request.
    */
  var deploymentJobs: js.UndefOr[DeploymentJobs] = js.native
  /**
    * The nextToken value to include in a future ListDeploymentJobs request. When the results of a ListDeploymentJobs request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDeploymentJobsResponse {
  @scala.inline
  def apply(deploymentJobs: DeploymentJobs = null, nextToken: PaginationToken = null): ListDeploymentJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (deploymentJobs != null) __obj.updateDynamic("deploymentJobs")(deploymentJobs.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentJobsResponse]
  }
}

