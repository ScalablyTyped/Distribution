package typings.antd.checkboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxGroupState extends js.Object {
  var registeredValues: js.Array[CheckboxValueType] = js.native
  var value: js.Array[CheckboxValueType] = js.native
}

object CheckboxGroupState {
  @scala.inline
  def apply(registeredValues: js.Array[CheckboxValueType], value: js.Array[CheckboxValueType]): CheckboxGroupState = {
    val __obj = js.Dynamic.literal(registeredValues = registeredValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupState]
  }
  @scala.inline
  implicit class CheckboxGroupStateOps[Self <: CheckboxGroupState] (val x: Self) extends AnyVal {
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
    def setRegisteredValuesVarargs(value: CheckboxValueType*): Self = this.set("registeredValues", js.Array(value :_*))
    @scala.inline
    def setRegisteredValues(value: js.Array[CheckboxValueType]): Self = this.set("registeredValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: CheckboxValueType*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[CheckboxValueType]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

