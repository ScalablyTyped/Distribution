package typings.antvG2.anon

import typings.antvG2.mod.Styles.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  /**
    * 辅助线结束位置，值为原始数据值，支持 callback
    */
  var end: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  /**
    * 图形样式配置
    */
  var lineStyle: js.UndefOr[line] = js.undefined
  /**
    * 辅助线起始位置，值为原始数据值，支持 callback
    */
  var start: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  var text: js.UndefOr[AutoRotate] = js.undefined
  /**
    * 指定 guide 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.undefined
}

object End {
  @scala.inline
  def apply(
    end: js.Any | js.Function | (js.Array[String | Double]) = null,
    lineStyle: line = null,
    start: js.Any | js.Function | (js.Array[String | Double]) = null,
    text: AutoRotate = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

