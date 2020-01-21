package typings.antvG2

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  /**
    * 显示的文本内容
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * y 方向偏移量
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * 文本的起始位置，值为原始数据值，支持 callback
    */
  var position: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  /**
    * 文本的图形样式属性
    */
  var style: js.UndefOr[text] = js.undefined
  /**
    * 指定 guide 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(
    content: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    position: js.Any | js.Function | (js.Array[String | Double]) = null,
    style: text = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

