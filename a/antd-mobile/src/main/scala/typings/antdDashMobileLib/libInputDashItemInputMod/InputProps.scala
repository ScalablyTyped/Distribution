package typings
package antdDashMobileLib.libInputDashItemInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLInputElement>, 'onFocus' | 'onBlur'> ]: react.react.HTMLProps<std.HTMLInputElement>[P]} */ trait InputProps extends js.Object {
  var onBlur: js.UndefOr[antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler] = js.undefined
  var onFocus: js.UndefOr[antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    onBlur: antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    onFocus: antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    __obj.asInstanceOf[InputProps]
  }
}

