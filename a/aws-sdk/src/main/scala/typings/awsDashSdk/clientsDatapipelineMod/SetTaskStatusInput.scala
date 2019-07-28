package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTaskStatusInput extends js.Object {
  /**
    * If an error occurred during the task, this value specifies the error code. This value is set on the physical attempt object. It is used to display error information to the user. It should not start with string "Service_" which is reserved by the system.
    */
  var errorId: js.UndefOr[String] = js.undefined
  /**
    * If an error occurred during the task, this value specifies a text description of the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorMessage: js.UndefOr[typings.awsDashSdk.clientsDatapipelineMod.errorMessage] = js.undefined
  /**
    * If an error occurred during the task, this value specifies the stack trace associated with the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorStackTrace: js.UndefOr[String] = js.undefined
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typings.awsDashSdk.clientsDatapipelineMod.taskId
  /**
    * If FINISHED, the task successfully completed. If FAILED, the task ended unsuccessfully. Preconditions use false.
    */
  var taskStatus: TaskStatus
}

object SetTaskStatusInput {
  @scala.inline
  def apply(
    taskId: taskId,
    taskStatus: TaskStatus,
    errorId: String = null,
    errorMessage: errorMessage = null,
    errorStackTrace: String = null
  ): SetTaskStatusInput = {
    val __obj = js.Dynamic.literal(taskId = taskId, taskStatus = taskStatus.asInstanceOf[js.Any])
    if (errorId != null) __obj.updateDynamic("errorId")(errorId)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (errorStackTrace != null) __obj.updateDynamic("errorStackTrace")(errorStackTrace)
    __obj.asInstanceOf[SetTaskStatusInput]
  }
}

