package typings.antd.esCheckboxCheckboxMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxChangeEventTarget extends CheckboxProps {
  @JSName("checked")
  var checked_CheckboxChangeEventTarget: Boolean
}

object CheckboxChangeEventTarget {
  @scala.inline
  def apply(
    checked: Boolean,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: CheckboxChangeEvent => Unit = null,
    onClick: MouseEventHandler[HTMLElement] = null,
    onKeyDown: KeyboardEventHandler[HTMLElement] = null,
    onKeyPress: KeyboardEventHandler[HTMLElement] = null,
    onMouseEnter: MouseEventHandler[HTMLElement] = null,
    onMouseLeave: MouseEventHandler[HTMLElement] = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    value: js.Any = null
  ): CheckboxChangeEventTarget = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CheckboxChangeEventTarget]
  }
}

