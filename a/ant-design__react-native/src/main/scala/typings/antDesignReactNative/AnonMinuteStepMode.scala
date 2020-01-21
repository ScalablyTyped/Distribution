package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinuteStepMode extends js.Object {
  var minuteStep: Double
  var mode: String
  var triggerType: String
}

object AnonMinuteStepMode {
  @scala.inline
  def apply(minuteStep: Double, mode: String, triggerType: String): AnonMinuteStepMode = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMinuteStepMode]
  }
}

