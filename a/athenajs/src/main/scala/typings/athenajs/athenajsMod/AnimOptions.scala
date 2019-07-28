package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimOptions extends js.Object {
  var frameDuration: Double
  var frameHeight: Double
  var frameSpacing: js.UndefOr[Double] = js.undefined
  var frameWidth: Double
  var numFrames: Double
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
}

object AnimOptions {
  @scala.inline
  def apply(
    frameDuration: Double,
    frameHeight: Double,
    frameWidth: Double,
    numFrames: Double,
    frameSpacing: Int | Double = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null
  ): AnimOptions = {
    val __obj = js.Dynamic.literal(frameDuration = frameDuration, frameHeight = frameHeight, frameWidth = frameWidth, numFrames = numFrames)
    if (frameSpacing != null) __obj.updateDynamic("frameSpacing")(frameSpacing.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimOptions]
  }
}

