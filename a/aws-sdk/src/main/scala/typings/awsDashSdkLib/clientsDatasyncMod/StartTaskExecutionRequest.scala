package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTaskExecutionRequest extends js.Object {
  /**
    *  A filter that determines which files to include in the transfer during a task execution based on the specified pattern in the filter. When multiple include filters are set, they are interpreted as an OR.
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  var OverrideOptions: js.UndefOr[Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: awsDashSdkLib.clientsDatasyncMod.TaskArn
}

object StartTaskExecutionRequest {
  @scala.inline
  def apply(TaskArn: TaskArn, Includes: FilterList = null, OverrideOptions: Options = null): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn)
    if (Includes != null) __obj.updateDynamic("Includes")(Includes)
    if (OverrideOptions != null) __obj.updateDynamic("OverrideOptions")(OverrideOptions)
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
}

