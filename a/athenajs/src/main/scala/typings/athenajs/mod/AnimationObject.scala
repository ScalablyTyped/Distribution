package typings.athenajs.mod

import typings.athenajs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationObject extends js.Object {
  var frameDuration: js.UndefOr[Double] = js.native
  var frames: js.Array[Height] = js.native
  var loop: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object AnimationObject {
  @scala.inline
  def apply(frames: js.Array[Height]): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
  @scala.inline
  implicit class AnimationObjectOps[Self <: AnimationObject] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: Height*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[Height]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameDuration(value: Double): Self = this.set("frameDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameDuration: Self = this.set("frameDuration", js.undefined)
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

