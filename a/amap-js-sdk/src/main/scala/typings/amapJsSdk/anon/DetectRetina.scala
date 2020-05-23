package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectRetina extends js.Object {
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  var errorUrl: js.UndefOr[String] = js.undefined
  var getTileUrl: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, String]] = js.undefined
  var map: typings.amapJsSdk.AMap.Map
  var opacity: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileUrl: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object DetectRetina {
  @scala.inline
  def apply(
    map: typings.amapJsSdk.AMap.Map,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: (/* x */ Double, /* y */ Double, /* z */ Double) => String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tileUrl: String = null,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Array[Double] = null
  ): DetectRetina = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.get.asInstanceOf[js.Any])
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl.asInstanceOf[js.Any])
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(js.Any.fromFunction3(getTileUrl))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectRetina]
  }
}

