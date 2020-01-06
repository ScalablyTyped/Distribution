package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTaskExecutionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that was started.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.TaskExecutionArn] = js.native
}

object StartTaskExecutionResponse {
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn = null): StartTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (TaskExecutionArn != null) __obj.updateDynamic("TaskExecutionArn")(TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskExecutionResponse]
  }
}

