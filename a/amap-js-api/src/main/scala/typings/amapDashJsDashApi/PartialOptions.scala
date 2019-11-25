package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.Bounds
import typings.amapDashJsDashApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.MediaLayer.Options> */
trait PartialOptions extends js.Object {
  var bounds: js.UndefOr[Bounds] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    bounds: Bounds = null,
    map: Map = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

