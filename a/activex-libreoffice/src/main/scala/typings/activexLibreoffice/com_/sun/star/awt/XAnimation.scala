package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows controlling an animation.
  * @since OOo 3.4
  */
@js.native
trait XAnimation extends js.Object {
  /** determines whether the animation is currently running */
  def isAnimationRunning(): Boolean = js.native
  /** starts the animation */
  def startAnimation(): Unit = js.native
  /** stops the animation */
  def stopAnimation(): Unit = js.native
}

object XAnimation {
  @scala.inline
  def apply(isAnimationRunning: () => Boolean, startAnimation: () => Unit, stopAnimation: () => Unit): XAnimation = {
    val __obj = js.Dynamic.literal(isAnimationRunning = js.Any.fromFunction0(isAnimationRunning), startAnimation = js.Any.fromFunction0(startAnimation), stopAnimation = js.Any.fromFunction0(stopAnimation))
    __obj.asInstanceOf[XAnimation]
  }
  @scala.inline
  implicit class XAnimationOps[Self <: XAnimation] (val x: Self) extends AnyVal {
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
    def setIsAnimationRunning(value: () => Boolean): Self = this.set("isAnimationRunning", js.Any.fromFunction0(value))
    @scala.inline
    def setStartAnimation(value: () => Unit): Self = this.set("startAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopAnimation(value: () => Unit): Self = this.set("stopAnimation", js.Any.fromFunction0(value))
  }
  
}

