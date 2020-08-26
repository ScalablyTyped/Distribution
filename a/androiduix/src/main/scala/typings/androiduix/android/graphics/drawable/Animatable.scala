package typings.androiduix.android.graphics.drawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animatable extends js.Object {
  def isRunning(): Boolean = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

object Animatable {
  @scala.inline
  def apply(isRunning: () => Boolean, start: () => Unit, stop: () => Unit): Animatable = {
    val __obj = js.Dynamic.literal(isRunning = js.Any.fromFunction0(isRunning), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Animatable]
  }
  @scala.inline
  implicit class AnimatableOps[Self <: Animatable] (val x: Self) extends AnyVal {
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
    def setIsRunning(value: () => Boolean): Self = this.set("isRunning", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

