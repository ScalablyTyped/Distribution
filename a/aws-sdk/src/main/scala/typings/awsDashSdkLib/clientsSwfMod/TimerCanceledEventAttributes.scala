package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerCanceledEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelTimer decision to cancel this timer. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The unique ID of the timer that was canceled.
    */
  var timerId: TimerId
}

object TimerCanceledEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, startedEventId: EventId, timerId: TimerId): TimerCanceledEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId, startedEventId = startedEventId, timerId = timerId)
  
    __obj.asInstanceOf[TimerCanceledEventAttributes]
  }
}

