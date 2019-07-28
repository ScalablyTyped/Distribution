package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecisionTaskCompletedEventAttributes extends js.Object {
  /**
    * User defined context for the workflow execution.
    */
  var executionContext: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}

object DecisionTaskCompletedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, executionContext: Data = null): DecisionTaskCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId)
    if (executionContext != null) __obj.updateDynamic("executionContext")(executionContext)
    __obj.asInstanceOf[DecisionTaskCompletedEventAttributes]
  }
}

