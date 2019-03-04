package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationObject extends js.Object {
  var frameDuration: js.UndefOr[scala.Double] = js.undefined
  var frames: js.Array[athenajsLib.Anon_Height]
  var loop: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object AnimationObject {
  @scala.inline
  def apply(
    frames: js.Array[athenajsLib.Anon_Height],
    frameDuration: scala.Int | scala.Double = null,
    loop: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null
  ): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames)
    if (frameDuration != null) __obj.updateDynamic("frameDuration")(frameDuration.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
}

