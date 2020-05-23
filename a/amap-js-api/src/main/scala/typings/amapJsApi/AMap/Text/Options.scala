package typings.amapJsApi.AMap.Text

import typings.amapJsApi.AMap.AnimationName
import typings.amapJsApi.AMap.Icon
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.Marker.Anchor
import typings.amapJsApi.AMap.Marker.Label
import typings.amapJsApi.AMap.MarkerShape
import typings.amapJsApi.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapJsApi.AMap.Marker.Options[js.Any] {
  /**
    * 文本内容
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * 对齐方式
    */
  var textAlign: js.UndefOr[TextAlign] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlign] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    angle: js.UndefOr[Double] = js.undefined,
    animation: AnimationName = null,
    autoRotation: js.UndefOr[Boolean] = js.undefined,
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    icon: String | Icon = null,
    label: Label = null,
    map: Map = null,
    offset: Pixel = null,
    position: LocationValue = null,
    raiseOnDrag: js.UndefOr[Boolean] = js.undefined,
    shadow: Icon | String = null,
    shape: MarkerShape = null,
    text: String = null,
    textAlign: TextAlign = null,
    title: String = null,
    topWhenClick: js.UndefOr[Boolean] = js.undefined,
    topWhenMouseOver: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlign = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRotation)) __obj.updateDynamic("autoRotation")(autoRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(raiseOnDrag)) __obj.updateDynamic("raiseOnDrag")(raiseOnDrag.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(topWhenClick)) __obj.updateDynamic("topWhenClick")(topWhenClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topWhenMouseOver)) __obj.updateDynamic("topWhenMouseOver")(topWhenMouseOver.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

