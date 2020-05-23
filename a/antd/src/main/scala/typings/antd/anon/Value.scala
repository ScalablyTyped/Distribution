package typings.antd.anon

import typings.antd.groupMod.CheckboxValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: js.Array[CheckboxValueType]
}

object Value {
  @scala.inline
  def apply(value: js.Array[CheckboxValueType]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

