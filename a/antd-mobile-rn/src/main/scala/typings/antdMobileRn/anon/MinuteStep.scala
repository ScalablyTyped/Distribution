package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinuteStep extends js.Object {
  var minuteStep: Double = js.native
  var mode: String = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  var triggerType: String = js.native
}

object MinuteStep {
  @scala.inline
  def apply(
    minuteStep: Double,
    mode: String,
    styles: StringDictionary[RegisteredStyle[_]],
    triggerType: String
  ): MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinuteStep]
  }
  @scala.inline
  implicit class MinuteStepOps[Self <: MinuteStep] (val x: Self) extends AnyVal {
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
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

