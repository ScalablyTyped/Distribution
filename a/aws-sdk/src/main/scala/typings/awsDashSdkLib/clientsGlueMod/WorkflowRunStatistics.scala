package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRunStatistics extends js.Object {
  /**
    * Total number of Actions which have failed.
    */
  var FailedActions: js.UndefOr[IntegerValue] = js.undefined
  /**
    * Total number Actions in running state.
    */
  var RunningActions: js.UndefOr[IntegerValue] = js.undefined
  /**
    * Total number of Actions which have stopped.
    */
  var StoppedActions: js.UndefOr[IntegerValue] = js.undefined
  /**
    * Total number of Actions which have succeeded.
    */
  var SucceededActions: js.UndefOr[IntegerValue] = js.undefined
  /**
    * Total number of Actions which timed out.
    */
  var TimeoutActions: js.UndefOr[IntegerValue] = js.undefined
  /**
    * Total number of Actions in the workflow run.
    */
  var TotalActions: js.UndefOr[IntegerValue] = js.undefined
}

object WorkflowRunStatistics {
  @scala.inline
  def apply(
    FailedActions: js.UndefOr[IntegerValue] = js.undefined,
    RunningActions: js.UndefOr[IntegerValue] = js.undefined,
    StoppedActions: js.UndefOr[IntegerValue] = js.undefined,
    SucceededActions: js.UndefOr[IntegerValue] = js.undefined,
    TimeoutActions: js.UndefOr[IntegerValue] = js.undefined,
    TotalActions: js.UndefOr[IntegerValue] = js.undefined
  ): WorkflowRunStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailedActions)) __obj.updateDynamic("FailedActions")(FailedActions)
    if (!js.isUndefined(RunningActions)) __obj.updateDynamic("RunningActions")(RunningActions)
    if (!js.isUndefined(StoppedActions)) __obj.updateDynamic("StoppedActions")(StoppedActions)
    if (!js.isUndefined(SucceededActions)) __obj.updateDynamic("SucceededActions")(SucceededActions)
    if (!js.isUndefined(TimeoutActions)) __obj.updateDynamic("TimeoutActions")(TimeoutActions)
    if (!js.isUndefined(TotalActions)) __obj.updateDynamic("TotalActions")(TotalActions)
    __obj.asInstanceOf[WorkflowRunStatistics]
  }
}

