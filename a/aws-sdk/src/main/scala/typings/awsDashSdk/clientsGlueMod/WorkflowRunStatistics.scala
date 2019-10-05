package typings.awsDashSdk.clientsGlueMod

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
    FailedActions: Int | Double = null,
    RunningActions: Int | Double = null,
    StoppedActions: Int | Double = null,
    SucceededActions: Int | Double = null,
    TimeoutActions: Int | Double = null,
    TotalActions: Int | Double = null
  ): WorkflowRunStatistics = {
    val __obj = js.Dynamic.literal()
    if (FailedActions != null) __obj.updateDynamic("FailedActions")(FailedActions.asInstanceOf[js.Any])
    if (RunningActions != null) __obj.updateDynamic("RunningActions")(RunningActions.asInstanceOf[js.Any])
    if (StoppedActions != null) __obj.updateDynamic("StoppedActions")(StoppedActions.asInstanceOf[js.Any])
    if (SucceededActions != null) __obj.updateDynamic("SucceededActions")(SucceededActions.asInstanceOf[js.Any])
    if (TimeoutActions != null) __obj.updateDynamic("TimeoutActions")(TimeoutActions.asInstanceOf[js.Any])
    if (TotalActions != null) __obj.updateDynamic("TotalActions")(TotalActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRunStatistics]
  }
}

