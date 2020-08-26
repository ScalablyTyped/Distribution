package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginLeftMarginRight extends js.Object {
  var marginLeft: Double = js.native
  var marginRight: Double = js.native
}

object MarginLeftMarginRight {
  @scala.inline
  def apply(marginLeft: Double, marginRight: Double): MarginLeftMarginRight = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftMarginRight]
  }
  @scala.inline
  implicit class MarginLeftMarginRightOps[Self <: MarginLeftMarginRight] (val x: Self) extends AnyVal {
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
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
  }
  
}

