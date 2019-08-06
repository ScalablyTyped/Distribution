package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTaskExecutionRequest extends js.Object {
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe). For example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  var OverrideOptions: js.UndefOr[Options] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: typings.awsDashSdk.clientsDatasyncMod.TaskArn
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

