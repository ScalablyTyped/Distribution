package typings.atAntvG2

import typings.atAntvG2.atAntvG2Strings.bottom
import typings.atAntvG2.atAntvG2Strings.left
import typings.atAntvG2.atAntvG2Strings.middle
import typings.atAntvG2.atAntvG2Strings.right
import typings.atAntvG2.atAntvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignX extends js.Object {
  var alignX: js.UndefOr[left | middle | right] = js.undefined
  var alignY: js.UndefOr[top | middle | bottom] = js.undefined
  /**
    * html 代码
    */
  var html: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * html的起始位置，值为原始数据值，支持 callback
    */
  var position: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Anon_AlignX {
  @scala.inline
  def apply(
    alignX: left | middle | right = null,
    alignY: top | middle | bottom = null,
    html: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    position: js.Any | js.Function | (js.Array[String | Double]) = null,
    zIndex: Int | Double = null
  ): Anon_AlignX = {
    val __obj = js.Dynamic.literal()
    if (alignX != null) __obj.updateDynamic("alignX")(alignX.asInstanceOf[js.Any])
    if (alignY != null) __obj.updateDynamic("alignY")(alignY.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignX]
  }
}

