package typings
package antdLib.libCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxChangeEventTarget extends CheckboxProps {
  @JSName("checked")
  var checked_CheckboxChangeEventTarget: scala.Boolean
}

object CheckboxChangeEventTarget {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: js.Function1[CheckboxChangeEvent, scala.Unit] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    onKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[_] = null,
    onKeyPress: reactLib.reactMod.ReactNs.KeyboardEventHandler[_] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    value: js.Any = null
  ): CheckboxChangeEventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
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

