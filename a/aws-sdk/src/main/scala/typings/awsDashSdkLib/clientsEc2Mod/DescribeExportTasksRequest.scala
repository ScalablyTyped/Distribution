package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExportTasksRequest extends js.Object {
  /**
    * One or more export task IDs.
    */
  var ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.undefined
}

object DescribeExportTasksRequest {
  @scala.inline
  def apply(ExportTaskIds: ExportTaskIdStringList = null): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (ExportTaskIds != null) __obj.updateDynamic("ExportTaskIds")(ExportTaskIds)
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
}

