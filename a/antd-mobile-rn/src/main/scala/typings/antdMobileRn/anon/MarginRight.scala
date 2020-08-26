package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginRight extends js.Object {
  var marginRight: Double = js.native
}

object MarginRight {
  @scala.inline
  def apply(marginRight: Double): MarginRight = {
    val __obj = js.Dynamic.literal(marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginRight]
  }
  @scala.inline
  implicit class MarginRightOps[Self <: MarginRight] (val x: Self) extends AnyVal {
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
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
  }
  
}

