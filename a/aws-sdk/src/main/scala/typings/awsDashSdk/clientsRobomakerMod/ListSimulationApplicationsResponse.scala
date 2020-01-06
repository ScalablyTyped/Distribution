package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationApplicationsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListSimulationApplications request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of simulation application summaries that meet the criteria of the request.
    */
  var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries] = js.native
}

object ListSimulationApplicationsResponse {
  @scala.inline
  def apply(
    nextToken: PaginationToken = null,
    simulationApplicationSummaries: SimulationApplicationSummaries = null
  ): ListSimulationApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (simulationApplicationSummaries != null) __obj.updateDynamic("simulationApplicationSummaries")(simulationApplicationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSimulationApplicationsResponse]
  }
}

