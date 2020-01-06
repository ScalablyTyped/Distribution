package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunTaskResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * A full description of the tasks that were run. The tasks that were successfully placed on your cluster are described here.
    */
  var tasks: js.UndefOr[Tasks] = js.native
}

object RunTaskResponse {
  @scala.inline
  def apply(failures: Failures = null, tasks: Tasks = null): RunTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunTaskResponse]
  }
}

