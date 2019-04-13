package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceExportTaskResult extends js.Object {
  /**
    * Information about the instance export task.
    */
  var ExportTask: js.UndefOr[ExportTask] = js.undefined
}

object CreateInstanceExportTaskResult {
  @scala.inline
  def apply(ExportTask: ExportTask = null): CreateInstanceExportTaskResult = {
    val __obj = js.Dynamic.literal()
    if (ExportTask != null) __obj.updateDynamic("ExportTask")(ExportTask)
    __obj.asInstanceOf[CreateInstanceExportTaskResult]
  }
}

