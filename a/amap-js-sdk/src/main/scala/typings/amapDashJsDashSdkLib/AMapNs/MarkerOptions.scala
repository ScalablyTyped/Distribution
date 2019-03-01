package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var autoRotation: js.UndefOr[scala.Boolean] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var extData: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[java.lang.String | Icon] = js.undefined
  var label: js.UndefOr[amapDashJsDashSdkLib.Anon_Content] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
  var position: js.UndefOr[LngLat] = js.undefined
  var raiseOnDrag: js.UndefOr[scala.Boolean] = js.undefined
  var shadow: js.UndefOr[Icon] = js.undefined
  var shape: js.UndefOr[MarkerShape] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var topWhenClick: js.UndefOr[scala.Boolean] = js.undefined
  var topWhenMouseOver: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    animation: java.lang.String = null,
    autoRotation: js.UndefOr[scala.Boolean] = js.undefined,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String | stdLib.HTMLElement = null,
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    extData: js.Any = null,
    icon: java.lang.String | Icon = null,
    label: amapDashJsDashSdkLib.Anon_Content = null,
    map: Map = null,
    offset: Pixel = null,
    position: LngLat = null,
    raiseOnDrag: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: Icon = null,
    shape: MarkerShape = null,
    title: java.lang.String = null,
    topWhenClick: js.UndefOr[scala.Boolean] = js.undefined,
    topWhenMouseOver: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoRotation)) __obj.updateDynamic("autoRotation")(autoRotation)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (extData != null) __obj.updateDynamic("extData")(extData)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (map != null) __obj.updateDynamic("map")(map)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(raiseOnDrag)) __obj.updateDynamic("raiseOnDrag")(raiseOnDrag)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(topWhenClick)) __obj.updateDynamic("topWhenClick")(topWhenClick)
    if (!js.isUndefined(topWhenMouseOver)) __obj.updateDynamic("topWhenMouseOver")(topWhenMouseOver)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

