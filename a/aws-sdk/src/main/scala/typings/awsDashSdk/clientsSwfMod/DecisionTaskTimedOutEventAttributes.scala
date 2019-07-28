package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecisionTaskTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The type of timeout that expired before the decision task could be completed.
    */
  var timeoutType: DecisionTaskTimeoutType
}

object DecisionTaskTimedOutEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: DecisionTaskTimeoutType): DecisionTaskTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId, timeoutType = timeoutType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecisionTaskTimedOutEventAttributes]
  }
}

