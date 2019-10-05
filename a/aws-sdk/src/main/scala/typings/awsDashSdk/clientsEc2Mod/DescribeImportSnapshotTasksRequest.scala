package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImportSnapshotTasksRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * A list of import snapshot task IDs.
    */
  var ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImportSnapshotTasksRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    ImportTaskIds: ImportTaskIdList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeImportSnapshotTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (ImportTaskIds != null) __obj.updateDynamic("ImportTaskIds")(ImportTaskIds)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImportSnapshotTasksRequest]
  }
}

