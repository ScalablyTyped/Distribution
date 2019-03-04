package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectRetinaMap extends js.Object {
  var detectRetina: js.UndefOr[scala.Boolean] = js.undefined
  var map: amapDashJsDashSdkLib.AMapNs.Map
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zooms: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_DetectRetinaMap {
  @scala.inline
  def apply(
    map: amapDashJsDashSdkLib.AMapNs.Map,
    detectRetina: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null,
    zooms: js.Array[scala.Double] = null
  ): Anon_DetectRetinaMap = {
    val __obj = js.Dynamic.literal(map = map)
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Anon_DetectRetinaMap]
  }
}

