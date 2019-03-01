package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTransition extends js.Object {
  var delay: scala.Double
  var duration: scala.Double
  var timingFunction: TimingFunction
}

object AnimationTransition {
  @scala.inline
  def apply(delay: scala.Double, duration: scala.Double, timingFunction: TimingFunction): AnimationTransition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("timingFunction")(timingFunction)
    __obj.asInstanceOf[AnimationTransition]
  }
}

