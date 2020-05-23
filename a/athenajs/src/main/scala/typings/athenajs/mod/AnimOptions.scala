package typings.athenajs.mod

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
    frameSpacing: js.UndefOr[Double] = js.undefined,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined
  ): AnimOptions = {
    val __obj = js.Dynamic.literal(frameDuration = frameDuration.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], numFrames = numFrames.asInstanceOf[js.Any])
    if (!js.isUndefined(frameSpacing)) __obj.updateDynamic("frameSpacing")(frameSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimOptions]
  }
}

