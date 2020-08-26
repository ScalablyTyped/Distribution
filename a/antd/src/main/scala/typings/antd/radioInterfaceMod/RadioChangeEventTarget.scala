package typings.antd.radioInterfaceMod

import typings.antd.checkboxCheckboxMod.AbstractCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioChangeEventTarget extends AbstractCheckboxProps[RadioChangeEvent] {
  @JSName("checked")
  var checked_RadioChangeEventTarget: Boolean = js.native
}

object RadioChangeEventTarget {
  @scala.inline
  def apply(checked: Boolean): RadioChangeEventTarget = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioChangeEventTarget]
  }
  @scala.inline
  implicit class RadioChangeEventTargetOps[Self <: RadioChangeEventTarget] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
  }
  
}

