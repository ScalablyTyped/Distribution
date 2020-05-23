package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillOpacity extends js.Object {
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

object FillOpacity {
  @scala.inline
  def apply(
    fill: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    stroke: String = null
  ): FillOpacity = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillOpacity]
  }
}

