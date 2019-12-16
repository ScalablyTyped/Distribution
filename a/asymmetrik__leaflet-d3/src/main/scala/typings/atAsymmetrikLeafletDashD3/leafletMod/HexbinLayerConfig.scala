package typings.atAsymmetrikLeafletDashD3.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexbinLayerConfig extends js.Object {
  var colorRange: js.UndefOr[js.Array[String]] = js.undefined
  var colorScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pointerEvents: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var radiusRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var radiusScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object HexbinLayerConfig {
  @scala.inline
  def apply(
    colorRange: js.Array[String] = null,
    colorScaleExtent: js.Tuple2[Double, Double] = null,
    duration: Int | Double = null,
    opacity: Int | Double = null,
    pointerEvents: String = null,
    radius: Int | Double = null,
    radiusRange: js.Tuple2[Double, Double] = null,
    radiusScaleExtent: js.Tuple2[Double, Double] = null
  ): HexbinLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (colorRange != null) __obj.updateDynamic("colorRange")(colorRange.asInstanceOf[js.Any])
    if (colorScaleExtent != null) __obj.updateDynamic("colorScaleExtent")(colorScaleExtent.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusRange != null) __obj.updateDynamic("radiusRange")(radiusRange.asInstanceOf[js.Any])
    if (radiusScaleExtent != null) __obj.updateDynamic("radiusScaleExtent")(radiusScaleExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexbinLayerConfig]
  }
}

