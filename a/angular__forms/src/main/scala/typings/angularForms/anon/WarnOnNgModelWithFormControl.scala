package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.always
import typings.angularForms.angularFormsStrings.never
import typings.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WarnOnNgModelWithFormControl extends js.Object {
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always = js.native
}

object WarnOnNgModelWithFormControl {
  @scala.inline
  def apply(warnOnNgModelWithFormControl: never | once | always): WarnOnNgModelWithFormControl = {
    val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarnOnNgModelWithFormControl]
  }
  @scala.inline
  implicit class WarnOnNgModelWithFormControlOps[Self <: WarnOnNgModelWithFormControl] (val x: Self) extends AnyVal {
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
    def setWarnOnNgModelWithFormControl(value: never | once | always): Self = this.set("warnOnNgModelWithFormControl", value.asInstanceOf[js.Any])
  }
  
}

