package typings.antd.groupMod

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
    val __obj = js.Dynamic.literal(registeredValues = registeredValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupState]
  }
}

