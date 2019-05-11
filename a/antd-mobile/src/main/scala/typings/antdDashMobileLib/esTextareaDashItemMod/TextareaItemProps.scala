package typings
package antdDashMobileLib.esTextareaDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLInputElement>, 'onChange' | 'onFocus' | 'onBlur' | 'value' | 'defaultValue' | 'type' | 'title'> ]: react.react.HTMLProps<std.HTMLInputElement>[P]} */ trait TextareaItemProps
  extends antdDashMobileLib.esTextareaDashItemPropsTypeMod.TextAreaItemPropsType {
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prefixListCls: js.UndefOr[java.lang.String] = js.undefined
}

object TextareaItemProps {
  @scala.inline
  def apply(
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    labelNumber: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onBlur: antdDashMobileLib.esTextareaDashItemPropsTypeMod.TextAreaEventHandle = null,
    onChange: antdDashMobileLib.esTextareaDashItemPropsTypeMod.TextAreaEventHandle = null,
    onErrorClick: () => scala.Unit = null,
    onFocus: antdDashMobileLib.esTextareaDashItemPropsTypeMod.TextAreaEventHandle = null,
    placeholder: java.lang.String = null,
    prefixCls: java.lang.String = null,
    prefixListCls: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    title: reactLib.reactMod.ReactNode = null,
    value: java.lang.String = null
  ): TextareaItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction0(onErrorClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prefixListCls != null) __obj.updateDynamic("prefixListCls")(prefixListCls)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaItemProps]
  }
}

