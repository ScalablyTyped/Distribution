package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskProgressInput extends js.Object {
  /**
    * Key-value pairs that define the properties of the ReportTaskProgressInput object.
    */
  var fields: js.UndefOr[fieldList] = js.undefined
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: awsDashSdkLib.clientsDatapipelineMod.taskId
}

object ReportTaskProgressInput {
  @scala.inline
  def apply(taskId: taskId, fields: fieldList = null): ReportTaskProgressInput = {
    val __obj = js.Dynamic.literal(taskId = taskId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ReportTaskProgressInput]
  }
}

