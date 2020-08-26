package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTransition extends js.Object {
  var delay: Double = js.native
  var duration: Double = js.native
  var timingFunction: TimingFunction = js.native
}

object AnimationTransition {
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: TimingFunction): AnimationTransition = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransition]
  }
  @scala.inline
  implicit class AnimationTransitionOps[Self <: AnimationTransition] (val x: Self) extends AnyVal {
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
    def setTimingFunction(value: TimingFunction): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
  }
  
}

