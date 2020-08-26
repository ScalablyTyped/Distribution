package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingBottomPaddingHorizontal extends js.Object {
  var paddingBottom: Double = js.native
  var paddingHorizontal: Double = js.native
  var paddingTop: Double = js.native
}

object PaddingBottomPaddingHorizontal {
  @scala.inline
  def apply(paddingBottom: Double, paddingHorizontal: Double, paddingTop: Double): PaddingBottomPaddingHorizontal = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomPaddingHorizontal]
  }
  @scala.inline
  implicit class PaddingBottomPaddingHorizontalOps[Self <: PaddingBottomPaddingHorizontal] (val x: Self) extends AnyVal {
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
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
  }
  
}

