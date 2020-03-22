package typings.antdMobile.inputMod

import typings.antdMobile.inputItemPropsTypeMod.InputEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends HTMLInputProps {
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    HTMLInputProps: HTMLInputProps = null,
    onBlur: /* value */ js.UndefOr[String] => Unit = null,
    onFocus: /* value */ js.UndefOr[String] => Unit = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (HTMLInputProps != null) js.Dynamic.global.Object.assign(__obj, HTMLInputProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    __obj.asInstanceOf[InputProps]
  }
}

