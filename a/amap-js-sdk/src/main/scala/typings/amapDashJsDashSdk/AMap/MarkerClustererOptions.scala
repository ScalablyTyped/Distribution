package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerClustererOptions extends js.Object {
  var averageCenter: js.UndefOr[Boolean] = js.undefined
  var gridSize: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minClusterSize: js.UndefOr[Double] = js.undefined
  var renderCluserMarker: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.undefined
  var styles: js.UndefOr[js.Array[_]] = js.undefined
  var zoomOnClick: js.UndefOr[Boolean] = js.undefined
}

object MarkerClustererOptions {
  @scala.inline
  def apply(
    averageCenter: js.UndefOr[Boolean] = js.undefined,
    gridSize: Int | Double = null,
    maxZoom: Int | Double = null,
    minClusterSize: Int | Double = null,
    renderCluserMarker: /* obj */ js.Any => Unit = null,
    styles: js.Array[_] = null,
    zoomOnClick: js.UndefOr[Boolean] = js.undefined
  ): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(averageCenter)) __obj.updateDynamic("averageCenter")(averageCenter.asInstanceOf[js.Any])
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minClusterSize != null) __obj.updateDynamic("minClusterSize")(minClusterSize.asInstanceOf[js.Any])
    if (renderCluserMarker != null) __obj.updateDynamic("renderCluserMarker")(js.Any.fromFunction1(renderCluserMarker))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnClick)) __obj.updateDynamic("zoomOnClick")(zoomOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerClustererOptions]
  }
}

