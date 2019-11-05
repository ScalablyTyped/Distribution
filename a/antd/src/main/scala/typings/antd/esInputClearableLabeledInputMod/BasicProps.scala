package typings.antd.esInputClearableLabeledInputMod

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This basic props required for input and textarea.
  */
trait BasicProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var element: ReactElement
  var inputType: text | input
  var prefixCls: String
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  def handleReset(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit
}

object BasicProps {
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent] => Unit,
    inputType: text | input,
    prefixCls: String,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    value: js.Any = null
  ): BasicProps = {
    val __obj = js.Dynamic.literal(element = element, handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BasicProps]
  }
}

