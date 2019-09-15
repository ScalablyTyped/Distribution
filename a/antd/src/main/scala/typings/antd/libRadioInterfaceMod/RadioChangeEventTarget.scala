package typings.antd.libRadioInterfaceMod

import typings.antd.libCheckboxCheckboxMod.AbstractCheckboxProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioChangeEventTarget extends AbstractCheckboxProps[RadioChangeEvent] {
  @JSName("checked")
  var checked_RadioChangeEventTarget: Boolean
}

object RadioChangeEventTarget {
  @scala.inline
  def apply(
    checked: Boolean,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    onChange: RadioChangeEvent => Unit = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLElement] => Unit = null,
    onMouseEnter: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    value: js.Any = null
  ): RadioChangeEventTarget = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioChangeEventTarget]
  }
}

