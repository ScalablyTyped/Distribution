package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Top extends js.Object {
  /**
    * 辅助框结束位置，值为原始数据值，支持 callback
    */
  var end: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  /**
    * 辅助框起始位置，值为原始数据值，支持 callback
    */
  var start: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
}

object Top {
  @scala.inline
  def apply(
    end: js.Any | js.Function | (js.Array[String | Double]) = null,
    start: js.Any | js.Function | (js.Array[String | Double]) = null,
    style: js.Object = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): Top = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
}

