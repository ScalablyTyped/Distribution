package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingHorizontalPaddingVertical extends js.Object {
  var paddingHorizontal: Double = js.native
  var paddingVertical: Double = js.native
}

object PaddingHorizontalPaddingVertical {
  @scala.inline
  def apply(paddingHorizontal: Double, paddingVertical: Double): PaddingHorizontalPaddingVertical = {
    val __obj = js.Dynamic.literal(paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingHorizontalPaddingVertical]
  }
  @scala.inline
  implicit class PaddingHorizontalPaddingVerticalOps[Self <: PaddingHorizontalPaddingVertical] (val x: Self) extends AnyVal {
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
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
  }
  
}

