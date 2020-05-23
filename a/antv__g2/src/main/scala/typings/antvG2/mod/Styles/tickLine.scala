package typings.antvG2.mod.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tickLine extends line {
  /**
    * 刻度线的长度，可以为负值（表示反方向渲染）
    */
  var length: js.UndefOr[Double] = js.undefined
}

object tickLine {
  @scala.inline
  def apply(
    arrowAngle: js.UndefOr[Double] = js.undefined,
    arrowRadius: js.UndefOr[Double] = js.undefined,
    endArrow: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    globalCompositeOperation: String = null,
    length: js.UndefOr[Double] = js.undefined,
    lineCap: String = null,
    lineDash: js.Array[Double] = null,
    lineJoin: String = null,
    lineWidth: String | Double = null,
    miterLimit: String | Double = null,
    opacity: String | Double = null,
    shadowBlur: String | Double = null,
    shadowColor: String = null,
    shadowOffsetX: String | Double = null,
    shadowOffsetY: String | Double = null,
    startArrow: js.UndefOr[Boolean] = js.undefined,
    stroke: String | Double = null,
    strokeOpacity: String | Double = null
  ): tickLine = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowAngle)) __obj.updateDynamic("arrowAngle")(arrowAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowRadius)) __obj.updateDynamic("arrowRadius")(arrowRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endArrow)) __obj.updateDynamic("endArrow")(endArrow.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(startArrow)) __obj.updateDynamic("startArrow")(startArrow.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[tickLine]
  }
}

