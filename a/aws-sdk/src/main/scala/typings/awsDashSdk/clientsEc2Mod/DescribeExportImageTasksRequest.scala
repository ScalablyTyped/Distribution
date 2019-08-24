package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportImageTasksRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the export image tasks.
    */
  var ExportImageTaskIds: js.UndefOr[ExportImageTaskIdList] = js.undefined
  /**
    * Filter tasks using the task-state filter and one of the following values: active, completed, deleting, or deleted.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[DescribeExportImageTasksMaxResults] = js.undefined
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.undefined
}

object DescribeExportImageTasksRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    ExportImageTaskIds: ExportImageTaskIdList = null,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeExportImageTasksMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeExportImageTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (ExportImageTaskIds != null) __obj.updateDynamic("ExportImageTaskIds")(ExportImageTaskIds)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeExportImageTasksRequest]
  }
}

