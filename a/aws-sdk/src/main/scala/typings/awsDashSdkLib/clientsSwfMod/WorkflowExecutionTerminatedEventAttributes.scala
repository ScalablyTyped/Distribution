package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
  /**
    * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens if the parent workflow execution times out or is terminated and the child policy is set to terminate child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined
  /**
    * The policy used for the child workflow executions of this workflow execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy
  /**
    * The details provided for the termination.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * The reason provided for the termination.
    */
  var reason: js.UndefOr[TerminateReason] = js.undefined
}

object WorkflowExecutionTerminatedEventAttributes {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    cause: WorkflowExecutionTerminatedCause = null,
    details: Data = null,
    reason: TerminateReason = null
  ): WorkflowExecutionTerminatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
  }
}

