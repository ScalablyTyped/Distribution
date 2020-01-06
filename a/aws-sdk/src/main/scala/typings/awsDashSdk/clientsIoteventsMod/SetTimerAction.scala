package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimerAction extends js.Object {
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy.
    */
  var seconds: Seconds = js.native
  /**
    * The name of the timer.
    */
  var timerName: TimerName = js.native
}

object SetTimerAction {
  @scala.inline
  def apply(seconds: Seconds, timerName: TimerName): SetTimerAction = {
    val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any], timerName = timerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetTimerAction]
  }
}

