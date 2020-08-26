package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexNumber extends js.Object {
  var flex: Double = js.native
}

object FlexNumber {
  @scala.inline
  def apply(flex: Double): FlexNumber = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexNumber]
  }
  @scala.inline
  implicit class FlexNumberOps[Self <: FlexNumber] (val x: Self) extends AnyVal {
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
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
  }
  
}

