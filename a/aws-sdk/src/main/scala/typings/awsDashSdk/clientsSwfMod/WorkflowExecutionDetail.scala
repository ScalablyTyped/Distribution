package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionDetail extends js.Object {
  /**
    * The configuration settings for this workflow execution including timeout values, tasklist etc.
    */
  var executionConfiguration: WorkflowExecutionConfiguration = js.native
  /**
    * Information about the workflow execution.
    */
  var executionInfo: WorkflowExecutionInfo = js.native
  /**
    * The time when the last activity task was scheduled for this workflow execution. You can use this information to determine if the workflow has not made progress for an unusually long period of time and might require a corrective action.
    */
  var latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The latest executionContext provided by the decider for this workflow execution. A decider can provide an executionContext (a free-form string) when closing a decision task using RespondDecisionTaskCompleted.
    */
  var latestExecutionContext: js.UndefOr[Data] = js.native
  /**
    * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
    */
  var openCounts: WorkflowExecutionOpenCounts = js.native
}

object WorkflowExecutionDetail {
  @scala.inline
  def apply(
    executionConfiguration: WorkflowExecutionConfiguration,
    executionInfo: WorkflowExecutionInfo,
    openCounts: WorkflowExecutionOpenCounts,
    latestActivityTaskTimestamp: Timestamp = null,
    latestExecutionContext: Data = null
  ): WorkflowExecutionDetail = {
    val __obj = js.Dynamic.literal(executionConfiguration = executionConfiguration.asInstanceOf[js.Any], executionInfo = executionInfo.asInstanceOf[js.Any], openCounts = openCounts.asInstanceOf[js.Any])
    if (latestActivityTaskTimestamp != null) __obj.updateDynamic("latestActivityTaskTimestamp")(latestActivityTaskTimestamp.asInstanceOf[js.Any])
    if (latestExecutionContext != null) __obj.updateDynamic("latestExecutionContext")(latestExecutionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionDetail]
  }
}

