package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionFailedEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the FailWorkflowExecution decision to fail this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The details of the failure.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * The descriptive reason provided for the failure.
    */
  var reason: js.UndefOr[FailureReason] = js.undefined
}

object WorkflowExecutionFailedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, details: Data = null, reason: FailureReason = null): WorkflowExecutionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId)
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[WorkflowExecutionFailedEventAttributes]
  }
}

