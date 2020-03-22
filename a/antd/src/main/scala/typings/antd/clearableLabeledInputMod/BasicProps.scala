package typings.antd.clearableLabeledInputMod

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text
import typings.react.mod.ReactElement
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
  var direction: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var element: ReactElement
  var focused: js.UndefOr[Boolean] = js.undefined
  var inputType: text | input
  var prefixCls: String
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  def handleReset(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit
}

object BasicProps {
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
    inputType: text | input,
    prefixCls: String,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    direction: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    value: js.Any = null
  ): BasicProps = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicProps]
  }
}

