package typings.antd

import typings.antd.libCheckboxGroupMod.CheckboxOptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOption extends js.Object {
  var disabled: Boolean
  var value: js.Any
  def toggleOption(option: CheckboxOptionType): Unit
}

object Anon_DisabledOption {
  @scala.inline
  def apply(disabled: Boolean, toggleOption: CheckboxOptionType => Unit, value: js.Any): Anon_DisabledOption = {
    val __obj = js.Dynamic.literal(disabled = disabled, toggleOption = js.Any.fromFunction1(toggleOption), value = value)
  
    __obj.asInstanceOf[Anon_DisabledOption]
  }
}

