package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionOpenCounts extends js.Object {
  /**
    * The count of activity tasks whose status is OPEN.
    */
  var openActivityTasks: Count = js.native
  /**
    * The count of child workflow executions whose status is OPEN.
    */
  var openChildWorkflowExecutions: Count = js.native
  /**
    * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
    */
  var openDecisionTasks: OpenDecisionTasksCount = js.native
  /**
    * The count of Lambda tasks whose status is OPEN.
    */
  var openLambdaFunctions: js.UndefOr[Count] = js.native
  /**
    * The count of timers started by this workflow execution that have not fired yet.
    */
  var openTimers: Count = js.native
}

object WorkflowExecutionOpenCounts {
  @scala.inline
  def apply(
    openActivityTasks: Count,
    openChildWorkflowExecutions: Count,
    openDecisionTasks: OpenDecisionTasksCount,
    openTimers: Count,
    openLambdaFunctions: Int | Double = null
  ): WorkflowExecutionOpenCounts = {
    val __obj = js.Dynamic.literal(openActivityTasks = openActivityTasks.asInstanceOf[js.Any], openChildWorkflowExecutions = openChildWorkflowExecutions.asInstanceOf[js.Any], openDecisionTasks = openDecisionTasks.asInstanceOf[js.Any], openTimers = openTimers.asInstanceOf[js.Any])
    if (openLambdaFunctions != null) __obj.updateDynamic("openLambdaFunctions")(openLambdaFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionOpenCounts]
  }
}

