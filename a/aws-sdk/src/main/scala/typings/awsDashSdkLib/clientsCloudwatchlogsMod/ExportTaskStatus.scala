package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTaskStatus extends js.Object {
  /**
    * The status code of the export task.
    */
  var code: js.UndefOr[ExportTaskStatusCode] = js.undefined
  /**
    * The status message related to the status code.
    */
  var message: js.UndefOr[ExportTaskStatusMessage] = js.undefined
}

object ExportTaskStatus {
  @scala.inline
  def apply(code: ExportTaskStatusCode = null, message: ExportTaskStatusMessage = null): ExportTaskStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ExportTaskStatus]
  }
}

