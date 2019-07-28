package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerDefinition extends js.Object {
  /**
    * The name of the timer.
    */
  var name: TimerName
  /**
    * The new setting of the timer (the number of seconds before the timer elapses).
    */
  var seconds: Seconds
}

object TimerDefinition {
  @scala.inline
  def apply(name: TimerName, seconds: Seconds): TimerDefinition = {
    val __obj = js.Dynamic.literal(name = name, seconds = seconds)
  
    __obj.asInstanceOf[TimerDefinition]
  }
}

