package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerFiredEventAttributes extends js.Object {
  /**
    * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The unique ID of the timer that fired.
    */
  var timerId: TimerId
}

object TimerFiredEventAttributes {
  @scala.inline
  def apply(startedEventId: EventId, timerId: TimerId): TimerFiredEventAttributes = {
    val __obj = js.Dynamic.literal(startedEventId = startedEventId, timerId = timerId)
  
    __obj.asInstanceOf[TimerFiredEventAttributes]
  }
}

