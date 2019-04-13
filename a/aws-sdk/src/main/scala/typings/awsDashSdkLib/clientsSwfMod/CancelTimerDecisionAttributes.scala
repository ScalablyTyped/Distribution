package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTimerDecisionAttributes extends js.Object {
  /**
    *  The unique ID of the timer to cancel.
    */
  var timerId: TimerId
}

object CancelTimerDecisionAttributes {
  @scala.inline
  def apply(timerId: TimerId): CancelTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(timerId = timerId)
  
    __obj.asInstanceOf[CancelTimerDecisionAttributes]
  }
}

