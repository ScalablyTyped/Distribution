package typings.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillOpacity extends js.Object {
  /**
    * 辅助框填充的颜色
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * 辅助框的背景透明度
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * 辅助框的边框宽度
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
}

object AnonFillOpacity {
  @scala.inline
  def apply(
    fill: String = null,
    fillOpacity: Int | Double = null,
    lineWidth: Int | Double = null,
    stroke: String = null
  ): AnonFillOpacity = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFillOpacity]
  }
}

