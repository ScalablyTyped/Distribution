package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var use12Hours: Boolean
}

object MinuteStep {
  @scala.inline
  def apply(minuteStep: Double, mode: String, use12Hours: Boolean): MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinuteStep]
  }
}

