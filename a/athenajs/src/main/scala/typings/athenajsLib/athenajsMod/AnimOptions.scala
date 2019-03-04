package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimOptions extends js.Object {
  var frameDuration: scala.Double
  var frameHeight: scala.Double
  var frameSpacing: js.UndefOr[scala.Double] = js.undefined
  var frameWidth: scala.Double
  var numFrames: scala.Double
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
}

object AnimOptions {
  @scala.inline
  def apply(
    frameDuration: scala.Double,
    frameHeight: scala.Double,
    frameWidth: scala.Double,
    numFrames: scala.Double,
    frameSpacing: scala.Int | scala.Double = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null
  ): AnimOptions = {
    val __obj = js.Dynamic.literal(frameDuration = frameDuration, frameHeight = frameHeight, frameWidth = frameWidth, numFrames = numFrames)
    if (frameSpacing != null) __obj.updateDynamic("frameSpacing")(frameSpacing.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimOptions]
  }
}

