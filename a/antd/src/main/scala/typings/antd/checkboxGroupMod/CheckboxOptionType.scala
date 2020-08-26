package typings.antd.checkboxGroupMod

import typings.antd.checkboxCheckboxMod.CheckboxChangeEvent
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var label: ReactNode = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var value: CheckboxValueType = js.native
}

object CheckboxOptionType {
  @scala.inline
  def apply(value: CheckboxValueType): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxOptionType]
  }
  @scala.inline
  implicit class CheckboxOptionTypeOps[Self <: CheckboxOptionType] (val x: Self) extends AnyVal {
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
    def setValue(value: CheckboxValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ CheckboxChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

