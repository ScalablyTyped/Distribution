package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginTopPaddingHorizontal extends js.Object {
  var marginTop: Double = js.native
  var paddingHorizontal: Double = js.native
}

object MarginTopPaddingHorizontal {
  @scala.inline
  def apply(marginTop: Double, paddingHorizontal: Double): MarginTopPaddingHorizontal = {
    val __obj = js.Dynamic.literal(marginTop = marginTop.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopPaddingHorizontal]
  }
  @scala.inline
  implicit class MarginTopPaddingHorizontalOps[Self <: MarginTopPaddingHorizontal] (val x: Self) extends AnyVal {
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
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
  }
  
}

