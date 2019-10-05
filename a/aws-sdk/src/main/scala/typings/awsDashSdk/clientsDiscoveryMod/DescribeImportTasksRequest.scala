package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImportTasksRequest extends js.Object {
  /**
    * An array of name-value pairs that you provide to filter the results for the DescribeImportTask request to a specific subset of results. Currently, wildcard values aren't supported for filters.
    */
  var filters: js.UndefOr[DescribeImportTasksFilterList] = js.undefined
  /**
    * The maximum number of results that you want this request to return, up to 100.
    */
  var maxResults: js.UndefOr[DescribeImportTasksMaxResults] = js.undefined
  /**
    * The token to request a specific page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeImportTasksRequest {
  @scala.inline
  def apply(
    filters: DescribeImportTasksFilterList = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): DescribeImportTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeImportTasksRequest]
  }
}

