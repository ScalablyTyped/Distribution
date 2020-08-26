package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var minuteStep: Double = js.native
  var mode: String = js.native
  var triggerType: String = js.native
}

object Mode {
  @scala.inline
  def apply(minuteStep: Double, mode: String, triggerType: String): Mode = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

