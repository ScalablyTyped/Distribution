package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var map: typings.amapJsSdk.AMap.Map
  var opacity: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object Map {
  @scala.inline
  def apply(
    map: typings.amapJsSdk.AMap.Map,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Array[Double] = null
  ): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

