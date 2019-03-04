package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Boolean
  var value: js.Any
  def toggleOption(option: antdLib.libCheckboxGroupMod.CheckboxOptionType): scala.Unit
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    toggleOption: js.Function1[antdLib.libCheckboxGroupMod.CheckboxOptionType, scala.Unit],
    value: js.Any
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, toggleOption = toggleOption, value = value)
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

