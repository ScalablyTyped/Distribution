package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var minuteStep: Double
  var mode: String
  var triggerType: String
}

object Mode {
  @scala.inline
  def apply(minuteStep: Double, mode: String, triggerType: String): Mode = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

