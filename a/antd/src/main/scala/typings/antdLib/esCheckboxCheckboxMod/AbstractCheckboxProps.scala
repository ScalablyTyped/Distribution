package typings
package antdLib.esCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractCheckboxProps[T] extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ T, scala.Unit]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyPress: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AbstractCheckboxProps {
  @scala.inline
  def apply[T](
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    name: java.lang.String = null,
    onChange: /* e */ T => scala.Unit = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    value: js.Any = null
  ): AbstractCheckboxProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
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
    __obj.asInstanceOf[AbstractCheckboxProps[T]]
  }
}

