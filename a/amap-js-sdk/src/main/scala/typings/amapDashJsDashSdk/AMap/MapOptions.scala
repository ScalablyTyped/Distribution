package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var animateEnable: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[LngLat] = js.undefined
  var crs: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var defaultLayer: js.UndefOr[TileLayer] = js.undefined
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragEnable: js.UndefOr[Boolean] = js.undefined
  var expandZoomRange: js.UndefOr[Boolean] = js.undefined
  var features: js.UndefOr[js.Array[String]] = js.undefined
  var indoorMap: js.UndefOr[IndoorMap] = js.undefined
  var isHotspot: js.UndefOr[Boolean] = js.undefined
  var jogEnable: js.UndefOr[Boolean] = js.undefined
  var keyboardEnable: js.UndefOr[Boolean] = js.undefined
  var labelzIndex: js.UndefOr[Double] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[TileLayer]] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var mapStyle: js.UndefOr[String] = js.undefined
  var resizeEnable: js.UndefOr[Boolean] = js.undefined
  var rotateEnable: js.UndefOr[Boolean] = js.undefined
  var scrollWheel: js.UndefOr[Boolean] = js.undefined
  var showIndoorMap: js.UndefOr[Boolean] = js.undefined
  var touchZoom: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[View2D] = js.undefined
  var zoomEnable: js.UndefOr[Boolean] = js.undefined
  var zooms: js.UndefOr[js.Array[Double]] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    animateEnable: js.UndefOr[Boolean] = js.undefined,
    center: LngLat = null,
    crs: String = null,
    cursor: String = null,
    defaultLayer: TileLayer = null,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragEnable: js.UndefOr[Boolean] = js.undefined,
    expandZoomRange: js.UndefOr[Boolean] = js.undefined,
    features: js.Array[String] = null,
    indoorMap: IndoorMap = null,
    isHotspot: js.UndefOr[Boolean] = js.undefined,
    jogEnable: js.UndefOr[Boolean] = js.undefined,
    keyboardEnable: js.UndefOr[Boolean] = js.undefined,
    labelzIndex: Int | Double = null,
    lang: String = null,
    layers: js.Array[TileLayer] = null,
    level: Int | Double = null,
    mapStyle: String = null,
    resizeEnable: js.UndefOr[Boolean] = js.undefined,
    rotateEnable: js.UndefOr[Boolean] = js.undefined,
    scrollWheel: js.UndefOr[Boolean] = js.undefined,
    showIndoorMap: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined,
    view: View2D = null,
    zoomEnable: js.UndefOr[Boolean] = js.undefined,
    zooms: js.Array[Double] = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateEnable)) __obj.updateDynamic("animateEnable")(animateEnable.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (defaultLayer != null) __obj.updateDynamic("defaultLayer")(defaultLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnable)) __obj.updateDynamic("dragEnable")(dragEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(expandZoomRange)) __obj.updateDynamic("expandZoomRange")(expandZoomRange.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (indoorMap != null) __obj.updateDynamic("indoorMap")(indoorMap.asInstanceOf[js.Any])
    if (!js.isUndefined(isHotspot)) __obj.updateDynamic("isHotspot")(isHotspot.asInstanceOf[js.Any])
    if (!js.isUndefined(jogEnable)) __obj.updateDynamic("jogEnable")(jogEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardEnable)) __obj.updateDynamic("keyboardEnable")(keyboardEnable.asInstanceOf[js.Any])
    if (labelzIndex != null) __obj.updateDynamic("labelzIndex")(labelzIndex.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeEnable)) __obj.updateDynamic("resizeEnable")(resizeEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateEnable)) __obj.updateDynamic("rotateEnable")(rotateEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWheel)) __obj.updateDynamic("scrollWheel")(scrollWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndoorMap)) __obj.updateDynamic("showIndoorMap")(showIndoorMap.asInstanceOf[js.Any])
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnable)) __obj.updateDynamic("zoomEnable")(zoomEnable.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

