package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearTimerAction extends js.Object {
  /**
    * The name of the timer to clear.
    */
  var timerName: TimerName
}

object ClearTimerAction {
  @scala.inline
  def apply(timerName: TimerName): ClearTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName)
  
    __obj.asInstanceOf[ClearTimerAction]
  }
}

