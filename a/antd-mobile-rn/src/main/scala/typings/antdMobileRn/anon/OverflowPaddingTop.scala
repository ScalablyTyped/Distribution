package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowPaddingTop extends js.Object {
  var borderRadius: Double = js.native
  var overflow: String = js.native
  var paddingTop: Double = js.native
  var width: Double = js.native
}

object OverflowPaddingTop {
  @scala.inline
  def apply(borderRadius: Double, overflow: String, paddingTop: Double, width: Double): OverflowPaddingTop = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowPaddingTop]
  }
  @scala.inline
  implicit class OverflowPaddingTopOps[Self <: OverflowPaddingTop] (val x: Self) extends AnyVal {
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
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

