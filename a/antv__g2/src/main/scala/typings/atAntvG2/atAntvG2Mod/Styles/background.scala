package typings.atAntvG2.atAntvG2Mod.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait background extends common {
  /**
    * 图表背景透明度
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * 图表边框粗度
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * 图表圆角大小
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * 图表边框透明度
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
}

object background {
  @scala.inline
  def apply(
    fill: String = null,
    fillOpacity: Int | Double = null,
    globalCompositeOperation: String = null,
    lineWidth: Int | Double = null,
    opacity: String | Double = null,
    radius: Int | Double = null,
    shadowBlur: String | Double = null,
    shadowColor: String = null,
    shadowOffsetX: String | Double = null,
    shadowOffsetY: String | Double = null,
    stroke: String | Double = null,
    strokeOpacity: Int | Double = null
  ): background = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[background]
  }
}

