package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTaskRequest extends js.Object {
  /**
    * The name of the task to update.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  var Options: js.UndefOr[Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource name of the task to update.
    */
  var TaskArn: awsDashSdkLib.clientsDatasyncMod.TaskArn
}

object UpdateTaskRequest {
  @scala.inline
  def apply(TaskArn: TaskArn, Name: TagValue = null, Options: Options = null): UpdateTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    __obj.asInstanceOf[UpdateTaskRequest]
  }
}

