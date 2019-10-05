package typings.antdDashMobile.libInputDashItemInputMod

import typings.antdDashMobile.libInputDashItemPropsTypeMod.InputEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLInputElement>, 'onFocus' | 'onBlur'> ]: react.react.HTMLProps<std.HTMLInputElement>[P]} */ trait InputProps extends js.Object {
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    onBlur: /* value */ js.UndefOr[String] => Unit = null,
    onFocus: /* value */ js.UndefOr[String] => Unit = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    __obj.asInstanceOf[InputProps]
  }
}

