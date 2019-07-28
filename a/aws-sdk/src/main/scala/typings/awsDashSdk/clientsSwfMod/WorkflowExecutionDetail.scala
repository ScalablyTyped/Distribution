package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionDetail extends js.Object {
  /**
    * The configuration settings for this workflow execution including timeout values, tasklist etc.
    */
  var executionConfiguration: WorkflowExecutionConfiguration
  /**
    * Information about the workflow execution.
    */
  var executionInfo: WorkflowExecutionInfo
  /**
    * The time when the last activity task was scheduled for this workflow execution. You can use this information to determine if the workflow has not made progress for an unusually long period of time and might require a corrective action.
    */
  var latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The latest executionContext provided by the decider for this workflow execution. A decider can provide an executionContext (a free-form string) when closing a decision task using RespondDecisionTaskCompleted.
    */
  var latestExecutionContext: js.UndefOr[Data] = js.undefined
  /**
    * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
    */
  var openCounts: WorkflowExecutionOpenCounts
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
    val __obj = js.Dynamic.literal(executionConfiguration = executionConfiguration, executionInfo = executionInfo, openCounts = openCounts)
    if (latestActivityTaskTimestamp != null) __obj.updateDynamic("latestActivityTaskTimestamp")(latestActivityTaskTimestamp)
    if (latestExecutionContext != null) __obj.updateDynamic("latestExecutionContext")(latestExecutionContext)
    __obj.asInstanceOf[WorkflowExecutionDetail]
  }
}

