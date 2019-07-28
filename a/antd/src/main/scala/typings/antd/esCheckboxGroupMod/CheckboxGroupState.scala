package typings.antd.esCheckboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGroupState extends js.Object {
  var registeredValues: js.Array[CheckboxValueType]
  var value: js.Array[CheckboxValueType]
}

object CheckboxGroupState {
  @scala.inline
  def apply(registeredValues: js.Array[CheckboxValueType], value: js.Array[CheckboxValueType]): CheckboxGroupState = {
    val __obj = js.Dynamic.literal(registeredValues = registeredValues, value = value)
  
    __obj.asInstanceOf[CheckboxGroupState]
  }
}

