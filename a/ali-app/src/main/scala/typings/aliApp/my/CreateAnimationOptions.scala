package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: Double = js.native
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: Double = js.native
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timeFunction: TimingFunction = js.native
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: String = js.native
}

object CreateAnimationOptions {
  @scala.inline
  def apply(delay: Double, duration: Double, timeFunction: TimingFunction, transformOrigin: String): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timeFunction = timeFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationOptions]
  }
  @scala.inline
  implicit class CreateAnimationOptionsOps[Self <: CreateAnimationOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeFunction(value: TimingFunction): Self = this.set("timeFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
  }
  
}

