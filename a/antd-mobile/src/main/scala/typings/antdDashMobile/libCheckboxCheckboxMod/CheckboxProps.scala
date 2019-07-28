package typings.antdDashMobile.libCheckboxCheckboxMod

import typings.antdDashMobile.libCheckboxPropsTypeMod.CheckboxPropsType
import typings.antdDashMobile.libCheckboxPropsTypeMod.OnChangeParams
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends CheckboxPropsType {
  var className: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var wrapLabel: js.UndefOr[Boolean] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* params */ OnChangeParams => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel)
    __obj.asInstanceOf[CheckboxProps]
  }
}

