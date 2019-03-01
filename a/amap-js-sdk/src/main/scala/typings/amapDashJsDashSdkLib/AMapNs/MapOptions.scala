package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var animateEnable: js.UndefOr[scala.Boolean] = js.undefined
  var center: js.UndefOr[LngLat] = js.undefined
  var crs: js.UndefOr[java.lang.String] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var defaultLayer: js.UndefOr[TileLayer] = js.undefined
  var doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var dragEnable: js.UndefOr[scala.Boolean] = js.undefined
  var expandZoomRange: js.UndefOr[scala.Boolean] = js.undefined
  var features: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var indoorMap: js.UndefOr[IndoorMap] = js.undefined
  var isHotspot: js.UndefOr[scala.Boolean] = js.undefined
  var jogEnable: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardEnable: js.UndefOr[scala.Boolean] = js.undefined
  var labelzIndex: js.UndefOr[scala.Double] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[TileLayer]] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var mapStyle: js.UndefOr[java.lang.String] = js.undefined
  var resizeEnable: js.UndefOr[scala.Boolean] = js.undefined
  var rotateEnable: js.UndefOr[scala.Boolean] = js.undefined
  var scrollWheel: js.UndefOr[scala.Boolean] = js.undefined
  var showIndoorMap: js.UndefOr[scala.Boolean] = js.undefined
  var touchZoom: js.UndefOr[scala.Boolean] = js.undefined
  var view: js.UndefOr[View2D] = js.undefined
  var zoomEnable: js.UndefOr[scala.Boolean] = js.undefined
  var zooms: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    animateEnable: js.UndefOr[scala.Boolean] = js.undefined,
    center: LngLat = null,
    crs: java.lang.String = null,
    cursor: java.lang.String = null,
    defaultLayer: TileLayer = null,
    doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    dragEnable: js.UndefOr[scala.Boolean] = js.undefined,
    expandZoomRange: js.UndefOr[scala.Boolean] = js.undefined,
    features: js.Array[java.lang.String] = null,
    indoorMap: IndoorMap = null,
    isHotspot: js.UndefOr[scala.Boolean] = js.undefined,
    jogEnable: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardEnable: js.UndefOr[scala.Boolean] = js.undefined,
    labelzIndex: scala.Int | scala.Double = null,
    lang: java.lang.String = null,
    layers: js.Array[TileLayer] = null,
    level: scala.Int | scala.Double = null,
    mapStyle: java.lang.String = null,
    resizeEnable: js.UndefOr[scala.Boolean] = js.undefined,
    rotateEnable: js.UndefOr[scala.Boolean] = js.undefined,
    scrollWheel: js.UndefOr[scala.Boolean] = js.undefined,
    showIndoorMap: js.UndefOr[scala.Boolean] = js.undefined,
    touchZoom: js.UndefOr[scala.Boolean] = js.undefined,
    view: View2D = null,
    zoomEnable: js.UndefOr[scala.Boolean] = js.undefined,
    zooms: js.Array[scala.Double] = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateEnable)) __obj.updateDynamic("animateEnable")(animateEnable)
    if (center != null) __obj.updateDynamic("center")(center)
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (defaultLayer != null) __obj.updateDynamic("defaultLayer")(defaultLayer)
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom)
    if (!js.isUndefined(dragEnable)) __obj.updateDynamic("dragEnable")(dragEnable)
    if (!js.isUndefined(expandZoomRange)) __obj.updateDynamic("expandZoomRange")(expandZoomRange)
    if (features != null) __obj.updateDynamic("features")(features)
    if (indoorMap != null) __obj.updateDynamic("indoorMap")(indoorMap)
    if (!js.isUndefined(isHotspot)) __obj.updateDynamic("isHotspot")(isHotspot)
    if (!js.isUndefined(jogEnable)) __obj.updateDynamic("jogEnable")(jogEnable)
    if (!js.isUndefined(keyboardEnable)) __obj.updateDynamic("keyboardEnable")(keyboardEnable)
    if (labelzIndex != null) __obj.updateDynamic("labelzIndex")(labelzIndex.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle)
    if (!js.isUndefined(resizeEnable)) __obj.updateDynamic("resizeEnable")(resizeEnable)
    if (!js.isUndefined(rotateEnable)) __obj.updateDynamic("rotateEnable")(rotateEnable)
    if (!js.isUndefined(scrollWheel)) __obj.updateDynamic("scrollWheel")(scrollWheel)
    if (!js.isUndefined(showIndoorMap)) __obj.updateDynamic("showIndoorMap")(showIndoorMap)
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(zoomEnable)) __obj.updateDynamic("zoomEnable")(zoomEnable)
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[MapOptions]
  }
}

