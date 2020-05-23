package typings.amapJsSdk.AMap

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
    gridSize: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minClusterSize: js.UndefOr[Double] = js.undefined,
    renderCluserMarker: /* obj */ js.Any => Unit = null,
    styles: js.Array[_] = null,
    zoomOnClick: js.UndefOr[Boolean] = js.undefined
  ): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(averageCenter)) __obj.updateDynamic("averageCenter")(averageCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gridSize)) __obj.updateDynamic("gridSize")(gridSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minClusterSize)) __obj.updateDynamic("minClusterSize")(minClusterSize.get.asInstanceOf[js.Any])
    if (renderCluserMarker != null) __obj.updateDynamic("renderCluserMarker")(js.Any.fromFunction1(renderCluserMarker))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnClick)) __obj.updateDynamic("zoomOnClick")(zoomOnClick.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerClustererOptions]
  }
}

