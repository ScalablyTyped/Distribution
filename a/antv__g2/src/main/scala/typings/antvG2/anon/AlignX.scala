package typings.antvG2.anon

import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignX extends js.Object {
  var alignX: js.UndefOr[left | middle | right] = js.native
  var alignY: js.UndefOr[top | middle | bottom] = js.native
  /**
    * html 代码
    */
  var html: js.UndefOr[String] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * html的起始位置，值为原始数据值，支持 callback
    */
  var position: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object AlignX {
  @scala.inline
  def apply(): AlignX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignX]
  }
  @scala.inline
  implicit class AlignXOps[Self <: AlignX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignX(value: left | middle | right): Self = this.set("alignX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignX: Self = this.set("alignX", js.undefined)
    @scala.inline
    def setAlignY(value: top | middle | bottom): Self = this.set("alignY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignY: Self = this.set("alignY", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPositionVarargs(value: (String | Double)*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Any | js.Function | (js.Array[String | Double])): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

