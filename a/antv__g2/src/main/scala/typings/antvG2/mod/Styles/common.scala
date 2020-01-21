package typings.antvG2.mod.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait common extends js.Object {
  /**
    * 设置用于填充绘画的颜色、渐变或模式；
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * 设置新图像如何绘制到已有的图像上。
    */
  var globalCompositeOperation: js.UndefOr[String] = js.undefined
  /**
    * 设置绘图的当前 alpha 或透明值；
    */
  var opacity: js.UndefOr[String | Double] = js.undefined
  /**
    * 设置用于阴影的模糊级别；
    */
  var shadowBlur: js.UndefOr[String | Double] = js.undefined
  /**
    * 设置用于阴影的颜色；
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * 设置阴影距形状的水平距离；
    */
  var shadowOffsetX: js.UndefOr[String | Double] = js.undefined
  /**
    * 设置阴影距形状的垂直距离；
    */
  var shadowOffsetY: js.UndefOr[String | Double] = js.undefined
  /**
    * 设置用于笔触的颜色、渐变或模式；
    */
  var stroke: js.UndefOr[String | Double] = js.undefined
}

object common {
  @scala.inline
  def apply(
    fill: String = null,
    globalCompositeOperation: String = null,
    opacity: String | Double = null,
    shadowBlur: String | Double = null,
    shadowColor: String = null,
    shadowOffsetX: String | Double = null,
    shadowOffsetY: String | Double = null,
    stroke: String | Double = null
  ): common = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[common]
  }
}

