package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndAngle extends js.Object {
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

object EndAngle {
  @scala.inline
  def apply(
    endAngle: js.UndefOr[Double] = js.undefined,
    innerRadius: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined
  ): EndAngle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadius)) __obj.updateDynamic("innerRadius")(innerRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAngle]
  }
}

