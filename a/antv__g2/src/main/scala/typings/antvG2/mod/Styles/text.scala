package typings.antvG2.mod.Styles

import typings.antvG2.antvG2Strings.`small-caps`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.italic
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.normal
import typings.antvG2.antvG2Strings.oblique
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.start
import typings.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait text extends common {
  var font: js.UndefOr[String] = js.undefined
  /**
    * 文本字体名称
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * 文本字号大小
    */
  var fontSize: js.UndefOr[String | Double] = js.undefined
  /**
    * 文本样式
    */
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
  /**
    * 文本变体
    */
  var fontVariant: js.UndefOr[normal | `small-caps`] = js.undefined
  /**
    * 文本粗细
    */
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  /**
    * 文本旋转角度
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * 文本对齐方向
    */
  var textAlign: js.UndefOr[center | end | left | right | start] = js.undefined
  /**
    * 文本基准线，默认为`middle`
    */
  var textBaseline: js.UndefOr[top | middle | bottom] = js.undefined
}

object text {
  @scala.inline
  def apply(
    fill: String = null,
    font: String = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: normal | italic | oblique = null,
    fontVariant: normal | `small-caps` = null,
    fontWeight: String | Double = null,
    globalCompositeOperation: String = null,
    opacity: String | Double = null,
    rotate: Int | Double = null,
    shadowBlur: String | Double = null,
    shadowColor: String = null,
    shadowOffsetX: String | Double = null,
    shadowOffsetY: String | Double = null,
    stroke: String | Double = null,
    textAlign: center | end | left | right | start = null,
    textBaseline: top | middle | bottom = null
  ): text = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[text]
  }
}

