package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskProgressInput extends js.Object {
  /**
    * Key-value pairs that define the properties of the ReportTaskProgressInput object.
    */
  var fields: js.UndefOr[fieldList] = js.native
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typings.awsDashSdk.clientsDatapipelineMod.taskId = js.native
}

object ReportTaskProgressInput {
  @scala.inline
  def apply(taskId: taskId, fields: fieldList = null): ReportTaskProgressInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskProgressInput]
  }
}

