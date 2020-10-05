package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateTimings extends js.Object {
  /**
    * The delay in applying an animation step. A number and optional time unit.
    * The default unit is milliseconds.
    */
  var delay: Double = js.native
  /**
    * The full duration of an animation step. A number and optional time unit,
    * such as "1s" or "10ms" for one second and 10 milliseconds, respectively.
    * The default unit is milliseconds.
    */
  var duration: Double = js.native
  /**
    * An easing style that controls how an animations step accelerates
    * and decelerates during its run time. An easing function such as `cubic-bezier()`,
    * or one of the following constants:
    * - `ease-in`
    * - `ease-out`
    * - `ease-in-and-out`
    */
  var easing: String | Null = js.native
}

object AnimateTimings {
  @scala.inline
  def apply(delay: Double, duration: Double): AnimateTimings = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateTimings]
  }
  @scala.inline
  implicit class AnimateTimingsOps[Self <: AnimateTimings] (val x: Self) extends AnyVal {
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
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasingNull: Self = this.set("easing", null)
  }
  
}

