package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingLeftNumber extends js.Object {
  var paddingLeft: Double = js.native
}

object PaddingLeftNumber {
  @scala.inline
  def apply(paddingLeft: Double): PaddingLeftNumber = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeftNumber]
  }
  @scala.inline
  implicit class PaddingLeftNumberOps[Self <: PaddingLeftNumber] (val x: Self) extends AnyVal {
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
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
  }
  
}

