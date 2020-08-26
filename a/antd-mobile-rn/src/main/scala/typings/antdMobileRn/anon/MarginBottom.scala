package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginBottom extends js.Object {
  var marginBottom: Double = js.native
  var marginRight: Double = js.native
  var overflow: String = js.native
}

object MarginBottom {
  @scala.inline
  def apply(marginBottom: Double, marginRight: Double, overflow: String): MarginBottom = {
    val __obj = js.Dynamic.literal(marginBottom = marginBottom.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginBottom]
  }
  @scala.inline
  implicit class MarginBottomOps[Self <: MarginBottom] (val x: Self) extends AnyVal {
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
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
  }
  
}

