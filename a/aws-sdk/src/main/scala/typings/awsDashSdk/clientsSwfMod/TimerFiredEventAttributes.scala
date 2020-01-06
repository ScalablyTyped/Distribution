package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerFiredEventAttributes extends js.Object {
  /**
    * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId = js.native
  /**
    * The unique ID of the timer that fired.
    */
  var timerId: TimerId = js.native
}

object TimerFiredEventAttributes {
  @scala.inline
  def apply(startedEventId: EventId, timerId: TimerId): TimerFiredEventAttributes = {
    val __obj = js.Dynamic.literal(startedEventId = startedEventId.asInstanceOf[js.Any], timerId = timerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimerFiredEventAttributes]
  }
}

