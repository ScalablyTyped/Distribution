package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportTasksRequest extends js.Object {
  /**
    * One or more unique identifiers used to query the status of an export request.
    */
  var exportIds: js.UndefOr[ExportIds] = js.undefined
  /**
    * One or more filters.    AgentId - ID of the agent whose collected data will be exported  
    */
  var filters: js.UndefOr[ExportFilters] = js.undefined
  /**
    * The maximum number of volume results returned by DescribeExportTasks in paginated output. When this parameter is used, DescribeExportTasks only returns maxResults results in a single page along with a nextToken response element.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The nextToken value returned from a previous paginated DescribeExportTasks request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeExportTasksRequest {
  @scala.inline
  def apply(
    exportIds: ExportIds = null,
    filters: ExportFilters = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (exportIds != null) __obj.updateDynamic("exportIds")(exportIds)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
}

