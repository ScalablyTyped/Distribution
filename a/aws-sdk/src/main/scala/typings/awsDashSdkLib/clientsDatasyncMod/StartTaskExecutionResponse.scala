package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTaskExecutionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that was started.
    */
  var TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
}

object StartTaskExecutionResponse {
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn = null): StartTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskExecutionArn != null) __obj.updateDynamic("TaskExecutionArn")(TaskExecutionArn)
    __obj.asInstanceOf[StartTaskExecutionResponse]
  }
}

