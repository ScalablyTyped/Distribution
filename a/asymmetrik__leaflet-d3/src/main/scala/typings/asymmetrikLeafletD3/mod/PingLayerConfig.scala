package typings.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PingLayerConfig extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var fps: js.UndefOr[Double] = js.undefined
  var opacityRange: js.UndefOr[js.Array[Double]] = js.undefined
  var radiusRange: js.UndefOr[js.Array[Double]] = js.undefined
}

object PingLayerConfig {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    fps: js.UndefOr[Double] = js.undefined,
    opacityRange: js.Array[Double] = null,
    radiusRange: js.Array[Double] = null
  ): PingLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fps)) __obj.updateDynamic("fps")(fps.get.asInstanceOf[js.Any])
    if (opacityRange != null) __obj.updateDynamic("opacityRange")(opacityRange.asInstanceOf[js.Any])
    if (radiusRange != null) __obj.updateDynamic("radiusRange")(radiusRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingLayerConfig]
  }
}

