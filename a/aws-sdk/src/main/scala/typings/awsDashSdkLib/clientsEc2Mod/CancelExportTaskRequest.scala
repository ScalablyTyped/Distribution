package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelExportTaskRequest extends js.Object {
  /**
    * The ID of the export task. This is the ID returned by CreateInstanceExportTask.
    */
  var ExportTaskId: String
}

object CancelExportTaskRequest {
  @scala.inline
  def apply(ExportTaskId: String): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(ExportTaskId = ExportTaskId)
  
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
}

