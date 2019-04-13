package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
  /**
    * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set to cancel child executions.
    */
  var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined
  /**
    * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var externalInitiatedEventId: js.UndefOr[EventId] = js.undefined
  /**
    * The external workflow execution for which the cancellation was requested.
    */
  var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
}

object WorkflowExecutionCancelRequestedEventAttributes {
  @scala.inline
  def apply(
    cause: WorkflowExecutionCancelRequestedCause = null,
    externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
    externalWorkflowExecution: WorkflowExecution = null
  ): WorkflowExecutionCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (!js.isUndefined(externalInitiatedEventId)) __obj.updateDynamic("externalInitiatedEventId")(externalInitiatedEventId)
    if (externalWorkflowExecution != null) __obj.updateDynamic("externalWorkflowExecution")(externalWorkflowExecution)
    __obj.asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
  }
}

