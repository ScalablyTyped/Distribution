package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTimerAction extends js.Object {
  /**
    * The name of the timer to clear.
    */
  var timerName: TimerName = js.native
}

object ClearTimerAction {
  @scala.inline
  def apply(timerName: TimerName): ClearTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClearTimerAction]
  }
}

