package typings.antd.inputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputState extends js.Object {
  var focused: Boolean
  /** `value` from prev props */
  var prevValue: js.Any
  var value: js.Any
}

object InputState {
  @scala.inline
  def apply(focused: Boolean, prevValue: js.Any, value: js.Any): InputState = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputState]
  }
}

