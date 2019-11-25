package typings.antd.esInputClearableLabeledInputMod

import typings.antd.antdStrings.input
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.text
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This props only for input.
  */
trait ClearableInputProps extends BasicProps {
  var addonAfter: js.UndefOr[ReactNode] = js.undefined
  var addonBefore: js.UndefOr[ReactNode] = js.undefined
  var prefix: js.UndefOr[ReactNode] = js.undefined
  var size: js.UndefOr[small | typings.antd.antdStrings.default | large] = js.undefined
  var suffix: js.UndefOr[ReactNode] = js.undefined
}

object ClearableInputProps {
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent] => Unit,
    inputType: text | input,
    prefixCls: String,
    addonAfter: ReactNode = null,
    addonBefore: ReactNode = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    prefix: ReactNode = null,
    size: small | typings.antd.antdStrings.default | large = null,
    style: js.Object = null,
    suffix: ReactNode = null,
    value: js.Any = null
  ): ClearableInputProps = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearableInputProps]
  }
}

