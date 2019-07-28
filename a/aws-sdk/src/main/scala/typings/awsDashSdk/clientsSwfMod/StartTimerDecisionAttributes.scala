package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTimerDecisionAttributes extends js.Object {
  /**
    * The data attached to the event that can be used by the decider in subsequent workflow tasks.
    */
  var control: js.UndefOr[Data] = js.undefined
  /**
    *  The duration to wait before firing the timer. The duration is specified in seconds, an integer greater than or equal to 0.
    */
  var startToFireTimeout: DurationInSeconds
  /**
    *  The unique ID of the timer. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var timerId: TimerId
}

object StartTimerDecisionAttributes {
  @scala.inline
  def apply(startToFireTimeout: DurationInSeconds, timerId: TimerId, control: Data = null): StartTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(startToFireTimeout = startToFireTimeout, timerId = timerId)
    if (control != null) __obj.updateDynamic("control")(control)
    __obj.asInstanceOf[StartTimerDecisionAttributes]
  }
}

