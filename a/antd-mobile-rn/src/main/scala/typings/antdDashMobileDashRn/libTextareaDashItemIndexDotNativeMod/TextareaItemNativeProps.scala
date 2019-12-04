package typings.antdDashMobileDashRn.libTextareaDashItemIndexDotNativeMod

import typings.antdDashMobileDashRn.libTextareaDashItemPropsTypeMod.TextAreaItemPropsType
import typings.antdDashMobileDashRn.libTextareaDashItemStyleIndexDotNativeMod.ITextareaItemStyle
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react-native.react-native.TextInputProperties extends any ? std.Pick<react-native.react-native.TextInputProperties, utility-types.utility-types/dist/mapped-types.SetComplement<keyof react-native.react-native.TextInputProperties, 'onChange' | 'onFocus' | 'onBlur'>> : never */ trait TextareaItemNativeProps extends TextAreaItemPropsType {
  var last: js.UndefOr[Boolean] = js.undefined
  var onContentSizeChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var styles: js.UndefOr[ITextareaItemStyle] = js.undefined
}

object TextareaItemNativeProps {
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
    onBlur: /* val */ js.UndefOr[String] => Unit = null,
    onChange: /* val */ js.UndefOr[String] => Unit = null,
    onContentSizeChange: /* e */ js.Any => Unit = null,
    onErrorClick: () => Unit = null,
    onFocus: /* val */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    rows: Int | Double = null,
    styles: ITextareaItemStyle = null,
    title: ReactNode = null,
    value: String = null
  ): TextareaItemNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction0(onErrorClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaItemNativeProps]
  }
}

