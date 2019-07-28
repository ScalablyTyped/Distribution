package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTaskExecutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task execution to cancel.
    */
  var TaskExecutionArn: typings.awsDashSdk.clientsDatasyncMod.TaskExecutionArn
}

object CancelTaskExecutionRequest {
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn): CancelTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn)
  
    __obj.asInstanceOf[CancelTaskExecutionRequest]
  }
}

