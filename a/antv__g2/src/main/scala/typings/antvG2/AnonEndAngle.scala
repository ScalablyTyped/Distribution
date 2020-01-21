package typings.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndAngle extends js.Object {
  /**
    * 极坐标的结束角度，单位为弧度
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  /**
    * 空心圆的半径，值范围为 0 至 1
    */
  var innerRadius: js.UndefOr[Double] = js.undefined
  /**
    * 设置半径，值范围为 0 至 1
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * 极坐标的起始角度，单位为弧度
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}

object AnonEndAngle {
  @scala.inline
  def apply(
    endAngle: Int | Double = null,
    innerRadius: Int | Double = null,
    radius: Int | Double = null,
    startAngle: Int | Double = null
  ): AnonEndAngle = {
    val __obj = js.Dynamic.literal()
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndAngle]
  }
}

