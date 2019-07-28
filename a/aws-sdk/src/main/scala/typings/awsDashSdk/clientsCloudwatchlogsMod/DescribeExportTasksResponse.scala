package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportTasksResponse extends js.Object {
  /**
    * The export tasks.
    */
  var exportTasks: js.UndefOr[ExportTasks] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeExportTasksResponse {
  @scala.inline
  def apply(exportTasks: ExportTasks = null, nextToken: NextToken = null): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (exportTasks != null) __obj.updateDynamic("exportTasks")(exportTasks)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
}

