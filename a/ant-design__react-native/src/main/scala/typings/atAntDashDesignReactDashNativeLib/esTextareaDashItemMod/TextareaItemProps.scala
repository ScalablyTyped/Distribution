package typings
package atAntDashDesignReactDashNativeLib.esTextareaDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof any, 'onChange' | 'onFocus' | 'onBlur'> ]: any[P]} */ trait TextareaItemProps
  extends atAntDashDesignReactDashNativeLib.esTextareaDashItemPropsTypeMod.TextAreaItemPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esTextareaDashItemStyleMod.TextareaItemStyle] {
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var onContentSizeChange: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
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
    last: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: atAntDashDesignReactDashNativeLib.esTextareaDashItemPropsTypeMod.TextAreaEventHandle = null,
    onContentSizeChange: /* e */ js.Any => scala.Unit = null,
    onErrorClick: () => scala.Unit = null,
    placeholder: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esTextareaDashItemStyleMod.TextareaItemStyle] = null,
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
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction0(onErrorClick))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaItemProps]
  }
}

