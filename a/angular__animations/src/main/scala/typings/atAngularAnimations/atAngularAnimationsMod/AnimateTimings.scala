package typings.atAngularAnimations.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateTimings extends js.Object {
  /**
    * The delay in applying an animation step. A number and optional time unit.
    * The default unit is milliseconds.
    */
  var delay: Double
  /**
    * The full duration of an animation step. A number and optional time unit,
    * such as "1s" or "10ms" for one second and 10 milliseconds, respectively.
    * The default unit is milliseconds.
    */
  var duration: Double
  /**
    * An easing style that controls how an animations step accelerates
    * and decelerates during its run time. An easing function such as `cubic-bezier()`,
    * or one of the following constants:
    * - `ease-in`
    * - `ease-out`
    * - `ease-in-and-out`
    */
  var easing: String | Null
}

object AnimateTimings {
  @scala.inline
  def apply(delay: Double, duration: Double, easing: String = null): AnimateTimings = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[AnimateTimings]
  }
}

