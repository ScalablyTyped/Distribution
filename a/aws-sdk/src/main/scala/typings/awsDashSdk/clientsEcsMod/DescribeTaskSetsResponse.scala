package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTaskSetsResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.undefined
  /**
    * The list of task sets described.
    */
  var taskSets: js.UndefOr[TaskSets] = js.undefined
}

object DescribeTaskSetsResponse {
  @scala.inline
  def apply(failures: Failures = null, taskSets: TaskSets = null): DescribeTaskSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (taskSets != null) __obj.updateDynamic("taskSets")(taskSets)
    __obj.asInstanceOf[DescribeTaskSetsResponse]
  }
}

