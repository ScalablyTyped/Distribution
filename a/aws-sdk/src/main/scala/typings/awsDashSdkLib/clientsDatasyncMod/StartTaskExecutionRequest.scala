package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTaskExecutionRequest extends js.Object {
  var OverrideOptions: js.UndefOr[Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: awsDashSdkLib.clientsDatasyncMod.TaskArn
}

object StartTaskExecutionRequest {
  @scala.inline
  def apply(TaskArn: TaskArn, OverrideOptions: Options = null): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn)
    if (OverrideOptions != null) __obj.updateDynamic("OverrideOptions")(OverrideOptions)
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
}

