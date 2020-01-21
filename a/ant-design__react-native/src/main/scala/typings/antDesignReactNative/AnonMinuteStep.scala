package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var use12Hours: Boolean
}

object AnonMinuteStep {
  @scala.inline
  def apply(minuteStep: Double, mode: String, use12Hours: Boolean): AnonMinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMinuteStep]
  }
}

