package typings.antd.checkboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroupContext extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object CheckboxGroupContext {
  @scala.inline
  def apply(): CheckboxGroupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxGroupContext]
  }
  @scala.inline
  implicit class CheckboxGroupContextOps[Self <: CheckboxGroupContext] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setToggleOption(value: /* option */ CheckboxOptionType => Unit): Self = this.set("toggleOption", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleOption: Self = this.set("toggleOption", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

