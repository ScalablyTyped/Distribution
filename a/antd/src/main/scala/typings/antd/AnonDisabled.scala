package typings.antd

import typings.antd.groupMod.CheckboxOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var value: js.Any
  def toggleOption(option: CheckboxOptionType): Unit
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: Boolean, toggleOption: CheckboxOptionType => Unit, value: js.Any): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], toggleOption = js.Any.fromFunction1(toggleOption), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabled]
  }
}

