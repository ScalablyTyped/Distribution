package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTasksResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  /**
    * The list of tasks.
    */
  var tasks: js.UndefOr[Tasks] = js.undefined
}

object DescribeTasksResponse {
  @scala.inline
  def apply(failures: Failures = null, tasks: Tasks = null): DescribeTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (tasks != null) __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[DescribeTasksResponse]
  }
}

