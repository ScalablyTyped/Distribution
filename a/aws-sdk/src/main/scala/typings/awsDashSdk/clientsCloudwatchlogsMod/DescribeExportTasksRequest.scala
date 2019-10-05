package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportTasksRequest extends js.Object {
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The status code of the export task. Specifying a status code filters the results to zero or more export tasks.
    */
  var statusCode: js.UndefOr[ExportTaskStatusCode] = js.undefined
  /**
    * The ID of the export task. Specifying a task ID filters the results to zero or one export tasks.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.undefined
}

object DescribeExportTasksRequest {
  @scala.inline
  def apply(
    limit: Int | Double = null,
    nextToken: NextToken = null,
    statusCode: ExportTaskStatusCode = null,
    taskId: ExportTaskId = null
  ): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
}

