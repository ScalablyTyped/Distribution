package typings.antd.libSwitchMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedChildren: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[SwitchChangeEventHandler] = js.undefined
  var onClick: js.UndefOr[SwitchClickEventHandler] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[SwitchSize] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var unCheckedChildren: js.UndefOr[ReactNode] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedChildren: ReactNode = null,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* checked */ Boolean, /* event */ MouseEvent) => Unit = null,
    onClick: (/* checked */ Boolean, /* event */ MouseEvent) => Unit = null,
    prefixCls: String = null,
    size: SwitchSize = null,
    style: CSSProperties = null,
    title: String = null,
    unCheckedChildren: ReactNode = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedChildren != null) __obj.updateDynamic("checkedChildren")(checkedChildren.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (unCheckedChildren != null) __obj.updateDynamic("unCheckedChildren")(unCheckedChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

