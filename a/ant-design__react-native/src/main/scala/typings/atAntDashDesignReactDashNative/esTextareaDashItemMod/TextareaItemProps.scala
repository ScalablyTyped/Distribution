package typings.atAntDashDesignReactDashNative.esTextareaDashItemMod

import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.atAntDashDesignReactDashNative.esTextareaDashItemPropsTypeMod.TextAreaItemPropsType
import typings.atAntDashDesignReactDashNative.esTextareaDashItemStyleMod.TextareaItemStyle
import typings.react.reactMod.ReactNode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any extends any ? std.Pick</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any, utility-types.utility-types/dist/mapped-types.SetComplement<keyof / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any, 'onChange' | 'onFocus' | 'onBlur'>> : never */ trait TextareaItemProps
  extends TextAreaItemPropsType
     with WithThemeStyles[TextareaItemStyle] {
  var last: js.UndefOr[Boolean] = js.undefined
  var onContentSizeChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
}

object TextareaItemProps {
  @scala.inline
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    labelNumber: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    name: String = null,
    onChange: /* val */ js.UndefOr[String] => Unit = null,
    onContentSizeChange: /* e */ js.Any => Unit = null,
    onErrorClick: () => Unit = null,
    placeholder: String = null,
    rows: Int | Double = null,
    styles: Partial[TextareaItemStyle] = null,
    title: ReactNode = null,
    value: String = null
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
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
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

