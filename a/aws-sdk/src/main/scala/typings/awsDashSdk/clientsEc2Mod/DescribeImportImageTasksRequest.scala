package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImportImageTasksRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter tasks using the task-state filter and one of the following values: active, completed, deleting, or deleted.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The IDs of the import image tasks.
    */
  var ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImportImageTasksRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    ImportTaskIds: ImportTaskIdList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): DescribeImportImageTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (ImportTaskIds != null) __obj.updateDynamic("ImportTaskIds")(ImportTaskIds)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImportImageTasksRequest]
  }
}

