package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskExecutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task that is being executed.
    */
  var TaskExecutionArn: typings.awsDashSdk.clientsDatasyncMod.TaskExecutionArn
}

object DescribeTaskExecutionRequest {
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn): DescribeTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn)
  
    __obj.asInstanceOf[DescribeTaskExecutionRequest]
  }
}

