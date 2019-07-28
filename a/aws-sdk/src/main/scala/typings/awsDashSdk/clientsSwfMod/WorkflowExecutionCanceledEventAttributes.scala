package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowExecutionCanceledEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.undefined
}

object WorkflowExecutionCanceledEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, details: Data = null): WorkflowExecutionCanceledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId)
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[WorkflowExecutionCanceledEventAttributes]
  }
}

