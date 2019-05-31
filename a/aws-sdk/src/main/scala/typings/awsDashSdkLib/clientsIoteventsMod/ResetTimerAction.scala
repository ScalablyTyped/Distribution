package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetTimerAction extends js.Object {
  /**
    * The name of the timer to reset.
    */
  var timerName: TimerName
}

object ResetTimerAction {
  @scala.inline
  def apply(timerName: TimerName): ResetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName)
  
    __obj.asInstanceOf[ResetTimerAction]
  }
}

