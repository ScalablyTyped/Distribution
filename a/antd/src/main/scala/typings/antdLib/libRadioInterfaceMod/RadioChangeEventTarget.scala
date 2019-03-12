package typings
package antdLib.libRadioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioChangeEventTarget
  extends antdLib.libCheckboxCheckboxMod.AbstractCheckboxProps[RadioChangeEvent] {
  @JSName("checked")
  var checked_RadioChangeEventTarget: scala.Boolean
}

object RadioChangeEventTarget {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: RadioChangeEvent => scala.Unit = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    onKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[_] = null,
    onKeyPress: reactLib.reactMod.ReactNs.KeyboardEventHandler[_] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    value: js.Any = null
  ): RadioChangeEventTarget = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
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
    __obj.asInstanceOf[RadioChangeEventTarget]
  }
}

