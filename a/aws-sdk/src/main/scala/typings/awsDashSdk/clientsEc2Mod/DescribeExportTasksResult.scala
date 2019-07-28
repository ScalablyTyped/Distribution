package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportTasksResult extends js.Object {
  /**
    * Information about the export tasks.
    */
  var ExportTasks: js.UndefOr[ExportTaskList] = js.undefined
}

object DescribeExportTasksResult {
  @scala.inline
  def apply(ExportTasks: ExportTaskList = null): DescribeExportTasksResult = {
    val __obj = js.Dynamic.literal()
    if (ExportTasks != null) __obj.updateDynamic("ExportTasks")(ExportTasks)
    __obj.asInstanceOf[DescribeExportTasksResult]
  }
}

