package typings.antd.esTransferSearchMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferSearchProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handleClear: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ FormEvent[HTMLElement], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TransferSearchProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleClear: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onChange: /* e */ FormEvent[HTMLElement] => Unit = null,
    placeholder: String = null,
    prefixCls: String = null,
    value: String = null
  ): TransferSearchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handleClear != null) __obj.updateDynamic("handleClear")(js.Any.fromFunction1(handleClear))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferSearchProps]
  }
}

