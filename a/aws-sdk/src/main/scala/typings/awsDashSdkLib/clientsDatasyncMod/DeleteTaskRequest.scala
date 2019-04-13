package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the task to delete.
    */
  var TaskArn: awsDashSdkLib.clientsDatasyncMod.TaskArn
}

object DeleteTaskRequest {
  @scala.inline
  def apply(TaskArn: TaskArn): DeleteTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn)
  
    __obj.asInstanceOf[DeleteTaskRequest]
  }
}

