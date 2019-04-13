package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task to describe.
    */
  var TaskArn: awsDashSdkLib.clientsDatasyncMod.TaskArn
}

object DescribeTaskRequest {
  @scala.inline
  def apply(TaskArn: TaskArn): DescribeTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn)
  
    __obj.asInstanceOf[DescribeTaskRequest]
  }
}

