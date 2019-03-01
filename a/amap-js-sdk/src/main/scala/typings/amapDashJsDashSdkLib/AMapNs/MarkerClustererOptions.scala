package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerClustererOptions extends js.Object {
  var averageCenter: js.UndefOr[scala.Boolean] = js.undefined
  var gridSize: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minClusterSize: js.UndefOr[scala.Double] = js.undefined
  var renderCluserMarker: js.UndefOr[js.Function1[/* obj */ js.Any, scala.Unit]] = js.undefined
  var styles: js.UndefOr[js.Array[_]] = js.undefined
  var zoomOnClick: js.UndefOr[scala.Boolean] = js.undefined
}

object MarkerClustererOptions {
  @scala.inline
  def apply(
    averageCenter: js.UndefOr[scala.Boolean] = js.undefined,
    gridSize: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minClusterSize: scala.Int | scala.Double = null,
    renderCluserMarker: js.Function1[/* obj */ js.Any, scala.Unit] = null,
    styles: js.Array[_] = null,
    zoomOnClick: js.UndefOr[scala.Boolean] = js.undefined
  ): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(averageCenter)) __obj.updateDynamic("averageCenter")(averageCenter)
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minClusterSize != null) __obj.updateDynamic("minClusterSize")(minClusterSize.asInstanceOf[js.Any])
    if (renderCluserMarker != null) __obj.updateDynamic("renderCluserMarker")(renderCluserMarker)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(zoomOnClick)) __obj.updateDynamic("zoomOnClick")(zoomOnClick)
    __obj.asInstanceOf[MarkerClustererOptions]
  }
}

