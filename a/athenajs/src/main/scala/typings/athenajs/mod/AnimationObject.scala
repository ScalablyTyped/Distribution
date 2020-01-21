package typings.athenajs.mod

import typings.athenajs.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationObject extends js.Object {
  var frameDuration: js.UndefOr[Double] = js.undefined
  var frames: js.Array[AnonHeight]
  var loop: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AnimationObject {
  @scala.inline
  def apply(
    frames: js.Array[AnonHeight],
    frameDuration: Int | Double = null,
    loop: Int | Double = null,
    speed: Int | Double = null
  ): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    if (frameDuration != null) __obj.updateDynamic("frameDuration")(frameDuration.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
}

