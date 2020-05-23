package typings.antd.clearableLabeledInputMod

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
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
  var size: js.UndefOr[SizeType] = js.undefined
  var suffix: js.UndefOr[ReactNode] = js.undefined
  def triggerFocus(): Unit
}

object ClearableInputProps {
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
    inputType: text | input,
    prefixCls: String,
    triggerFocus: () => Unit,
    addonAfter: ReactNode = null,
    addonBefore: ReactNode = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    direction: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    prefix: ReactNode = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    size: SizeType = null,
    style: js.Object = null,
    suffix: ReactNode = null,
    value: js.Any = null
  ): ClearableInputProps = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFocus = js.Any.fromFunction0(triggerFocus))
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearableInputProps]
  }
}

