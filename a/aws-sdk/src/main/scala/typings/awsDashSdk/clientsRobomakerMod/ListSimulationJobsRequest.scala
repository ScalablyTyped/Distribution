package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSimulationJobsRequest extends js.Object {
  /**
    * Optional filters to limit results. The filter names status and simulationApplicationName and robotApplicationName are supported. When filtering, you must use the complete value of the filtered item. You can use up to three filters, but they must be for the same named item. For example, if you are looking for items with the status Preparing or the status Running.
    */
  var filters: js.UndefOr[Filters] = js.undefined
  /**
    * The maximum number of deployment job results returned by ListSimulationJobs in paginated output. When this parameter is used, ListSimulationJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListSimulationJobs request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListSimulationJobs returns up to 100 results and a nextToken value if applicable. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The nextToken value returned from a previous paginated ListSimulationJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListSimulationJobsRequest {
  @scala.inline
  def apply(
    filters: Filters = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null
  ): ListSimulationJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSimulationJobsRequest]
  }
}

