package typings.antd.radioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroupContextProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var value: js.Any = js.native
  def onChange(e: RadioChangeEvent): Unit = js.native
}

object RadioGroupContextProps {
  @scala.inline
  def apply(onChange: RadioChangeEvent => Unit, value: js.Any): RadioGroupContextProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupContextProps]
  }
  @scala.inline
  implicit class RadioGroupContextPropsOps[Self <: RadioGroupContextProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: RadioChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

