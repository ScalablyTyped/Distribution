package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerStartedEventAttributes extends js.Object {
  /**
    * Data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartTimer decision for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The duration of time after which the timer fires. The duration is specified in seconds, an integer greater than or equal to 0.
    */
  var startToFireTimeout: DurationInSeconds
  /**
    * The unique ID of the timer that was started.
    */
  var timerId: TimerId
}

object TimerStartedEventAttributes {
  @scala.inline
  def apply(
    decisionTaskCompletedEventId: EventId,
    startToFireTimeout: DurationInSeconds,
    timerId: TimerId,
    control: Data = null
  ): TimerStartedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId, startToFireTimeout = startToFireTimeout, timerId = timerId)
    if (control != null) __obj.updateDynamic("control")(control)
    __obj.asInstanceOf[TimerStartedEventAttributes]
  }
}

