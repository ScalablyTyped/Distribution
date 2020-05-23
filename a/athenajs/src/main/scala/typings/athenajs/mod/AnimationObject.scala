package typings.athenajs.mod

import typings.athenajs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationObject extends js.Object {
  var frameDuration: js.UndefOr[Double] = js.undefined
  var frames: js.Array[Height]
  var loop: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object AnimationObject {
  @scala.inline
  def apply(
    frames: js.Array[Height],
    frameDuration: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    if (!js.isUndefined(frameDuration)) __obj.updateDynamic("frameDuration")(frameDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
}

