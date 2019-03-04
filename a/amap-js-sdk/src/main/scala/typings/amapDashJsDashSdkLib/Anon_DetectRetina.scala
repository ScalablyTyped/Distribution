package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetectRetina extends js.Object {
  var detectRetina: js.UndefOr[scala.Boolean] = js.undefined
  var errorUrl: js.UndefOr[java.lang.String] = js.undefined
  var getTileUrl: js.UndefOr[
    js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, java.lang.String]
  ] = js.undefined
  var map: amapDashJsDashSdkLib.AMapNs.Map
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var tileUrl: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zooms: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_DetectRetina {
  @scala.inline
  def apply(
    map: amapDashJsDashSdkLib.AMapNs.Map,
    detectRetina: js.UndefOr[scala.Boolean] = js.undefined,
    errorUrl: java.lang.String = null,
    getTileUrl: js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, java.lang.String] = null,
    opacity: scala.Int | scala.Double = null,
    tileSize: scala.Int | scala.Double = null,
    tileUrl: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null,
    zooms: js.Array[scala.Double] = null
  ): Anon_DetectRetina = {
    val __obj = js.Dynamic.literal(map = map)
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl)
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(getTileUrl)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Anon_DetectRetina]
  }
}

