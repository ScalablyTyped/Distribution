package typings.amapDashJsDashApi.AMap.Marker

import typings.amapDashJsDashApi.AMap.AnimationName
import typings.amapDashJsDashApi.AMap.Icon
import typings.amapDashJsDashApi.AMap.LocationValue
import typings.amapDashJsDashApi.AMap.Map
import typings.amapDashJsDashApi.AMap.MarkerShape
import typings.amapDashJsDashApi.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ExtraData]
  extends typings.amapDashJsDashApi.AMap.Overlay.Options[ExtraData] {
  /**
    * 标记锚点
    */
  var anchor: js.UndefOr[Anchor] = js.undefined
  /**
    * 点标记的旋转角度
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * 点标记的动画效果
    */
  var animation: js.UndefOr[AnimationName] = js.undefined
  /**
    * 是否自动旋转
    */
  var autoRotation: js.UndefOr[Boolean] = js.undefined
  /**
    * 点标记显示内容
    */
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 需在点标记中显示的图标
    */
  var icon: js.UndefOr[String | Icon] = js.undefined
  /**
    * 文本标注
    */
  var label: js.UndefOr[Label] = js.undefined
  /**
    * 点标记显示位置偏移量
    */
  var offset: js.UndefOr[Pixel] = js.undefined
  /**
    * 点标记在地图上显示的位置
    */
  var position: js.UndefOr[LocationValue] = js.undefined
  /**
    * 拖拽点标记时是否开启点标记离开地图的效果
    */
  var raiseOnDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * 点标记阴影
    */
  var shadow: js.UndefOr[Icon | String] = js.undefined
  /**
    * 可点击区域
    */
  var shape: js.UndefOr[MarkerShape] = js.undefined
  /**
    * 鼠标滑过点标记时的文字提示
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 鼠标点击时marker是否置顶
    */
  var topWhenClick: js.UndefOr[Boolean] = js.undefined
  var topWhenMouseOver: js.UndefOr[Boolean] = js.undefined
  /**
    * 点标记是否可见
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * 点标记的叠加顺序
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  // internal
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply[ExtraData](
    anchor: Anchor = null,
    angle: Int | Double = null,
    animation: AnimationName = null,
    autoRotation: js.UndefOr[Boolean] = js.undefined,
    bubble: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    extData: ExtraData = null,
    height: Int | Double = null,
    icon: String | Icon = null,
    label: Label = null,
    map: Map = null,
    offset: Pixel = null,
    position: LocationValue = null,
    raiseOnDrag: js.UndefOr[Boolean] = js.undefined,
    shadow: Icon | String = null,
    shape: MarkerShape = null,
    title: String = null,
    topWhenClick: js.UndefOr[Boolean] = js.undefined,
    topWhenMouseOver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRotation)) __obj.updateDynamic("autoRotation")(autoRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(bubble)) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (extData != null) __obj.updateDynamic("extData")(extData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(raiseOnDrag)) __obj.updateDynamic("raiseOnDrag")(raiseOnDrag.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(topWhenClick)) __obj.updateDynamic("topWhenClick")(topWhenClick.asInstanceOf[js.Any])
    if (!js.isUndefined(topWhenMouseOver)) __obj.updateDynamic("topWhenMouseOver")(topWhenMouseOver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[ExtraData]]
  }
}

