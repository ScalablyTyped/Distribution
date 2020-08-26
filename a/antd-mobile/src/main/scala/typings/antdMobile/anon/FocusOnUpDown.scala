package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusOnUpDown extends js.Object {
  var focusOnUpDown: Boolean = js.native
  var prefixCls: String = js.native
  var readOnly: Boolean = js.native
  var showNumber: Boolean = js.native
  var step: Double = js.native
}

object FocusOnUpDown {
  @scala.inline
  def apply(focusOnUpDown: Boolean, prefixCls: String, readOnly: Boolean, showNumber: Boolean, step: Double): FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], showNumber = showNumber.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOnUpDown]
  }
  @scala.inline
  implicit class FocusOnUpDownOps[Self <: FocusOnUpDown] (val x: Self) extends AnyVal {
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
    def setFocusOnUpDown(value: Boolean): Self = this.set("focusOnUpDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNumber(value: Boolean): Self = this.set("showNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

