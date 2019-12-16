package typings.atAsymmetrikLeafletDashD3.leafletMod

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
    duration: Int | Double = null,
    fps: Int | Double = null,
    opacityRange: js.Array[Double] = null,
    radiusRange: js.Array[Double] = null
  ): PingLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (opacityRange != null) __obj.updateDynamic("opacityRange")(opacityRange.asInstanceOf[js.Any])
    if (radiusRange != null) __obj.updateDynamic("radiusRange")(radiusRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingLayerConfig]
  }
}

