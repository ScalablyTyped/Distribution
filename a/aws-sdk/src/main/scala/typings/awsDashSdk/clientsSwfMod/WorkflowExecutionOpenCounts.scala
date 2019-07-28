package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionOpenCounts extends js.Object {
  /**
    * The count of activity tasks whose status is OPEN.
    */
  var openActivityTasks: Count
  /**
    * The count of child workflow executions whose status is OPEN.
    */
  var openChildWorkflowExecutions: Count
  /**
    * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
    */
  var openDecisionTasks: OpenDecisionTasksCount
  /**
    * The count of Lambda tasks whose status is OPEN.
    */
  var openLambdaFunctions: js.UndefOr[Count] = js.undefined
  /**
    * The count of timers started by this workflow execution that have not fired yet.
    */
  var openTimers: Count
}

object WorkflowExecutionOpenCounts {
  @scala.inline
  def apply(
    openActivityTasks: Count,
    openChildWorkflowExecutions: Count,
    openDecisionTasks: OpenDecisionTasksCount,
    openTimers: Count,
    openLambdaFunctions: js.UndefOr[Count] = js.undefined
  ): WorkflowExecutionOpenCounts = {
    val __obj = js.Dynamic.literal(openActivityTasks = openActivityTasks, openChildWorkflowExecutions = openChildWorkflowExecutions, openDecisionTasks = openDecisionTasks, openTimers = openTimers)
    if (!js.isUndefined(openLambdaFunctions)) __obj.updateDynamic("openLambdaFunctions")(openLambdaFunctions)
    __obj.asInstanceOf[WorkflowExecutionOpenCounts]
  }
}

