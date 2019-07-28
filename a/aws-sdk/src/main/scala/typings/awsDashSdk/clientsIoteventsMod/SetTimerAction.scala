package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTimerAction extends js.Object {
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy.
    */
  var seconds: Seconds
  /**
    * The name of the timer.
    */
  var timerName: TimerName
}

object SetTimerAction {
  @scala.inline
  def apply(seconds: Seconds, timerName: TimerName): SetTimerAction = {
    val __obj = js.Dynamic.literal(seconds = seconds, timerName = timerName)
  
    __obj.asInstanceOf[SetTimerAction]
  }
}

