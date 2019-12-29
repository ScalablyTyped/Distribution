package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.atAntvG2Mod.Styles.text
import typings.atAntvG2.atAntvG2Strings.center
import typings.atAntvG2.atAntvG2Strings.end
import typings.atAntvG2.atAntvG2Strings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标轴线
  */
trait AxisTitle extends js.Object {
  /**
    * 是否需要自动旋转，默认为 `true`
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  /**
    * 数值，设置坐标轴标题距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * 标题的显示位置（相对于坐标轴线）
    */
  var position: js.UndefOr[start | center | end] = js.undefined
  /**
    * 设置标题的文本样式
    */
  var textStyle: js.UndefOr[text] = js.undefined
}

object AxisTitle {
  @scala.inline
  def apply(
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    position: start | center | end = null,
    textStyle: text = null
  ): AxisTitle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisTitle]
  }
}

