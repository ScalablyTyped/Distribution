package typings.amapJsSdk

import typings.amapJsSdk.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectRetinaMap extends js.Object {
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var map: Map
  var opacity: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonDetectRetinaMap {
  @scala.inline
  def apply(
    map: Map,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    zIndex: Int | Double = null,
    zooms: js.Array[Double] = null
  ): AnonDetectRetinaMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetectRetinaMap]
  }
}

