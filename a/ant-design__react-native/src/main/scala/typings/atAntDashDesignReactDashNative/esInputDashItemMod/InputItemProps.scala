package typings.atAntDashDesignReactDashNative.esInputDashItemMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bankCard
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.digit
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.left
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.number
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.password
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.phone
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.text
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.esInputDashItemPropsTypeMod.InputItemPropsType
import typings.atAntDashDesignReactDashNative.esInputDashItemStyleMod.InputItemStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.KeyboardTypeOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any extends any ? std.Pick</ * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any, utility-types.utility-types/dist/mapped-types.SetComplement<keyof / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any, 'onChange' | 'onFocus' | 'onBlur'>> : never */ trait InputItemProps
  extends InputItemPropsType
     with WithThemeStyles[InputItemStyle] {
  var last: js.UndefOr[Boolean] = js.undefined
  var onErrorClick: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onExtraClick: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
}

object InputItemProps {
  @scala.inline
  def apply(
    clear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    labelNumber: Int | Double = null,
    labelPosition: left | top = null,
    last: js.UndefOr[Boolean] = js.undefined,
    locale: js.Object = null,
    maxLength: Int | Double = null,
    name: String = null,
    onBlur: /* value */ js.UndefOr[String] => Unit = null,
    onChange: /* value */ String => Unit = null,
    onErrorClick: /* event */ GestureResponderEvent => Unit = null,
    onExtraClick: /* event */ GestureResponderEvent => Unit = null,
    onFocus: /* value */ js.UndefOr[String] => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    styles: Partial[InputItemStyle] = null,
    textAlign: left | center = null,
    `type`: text | bankCard | phone | password | number | digit | KeyboardTypeOptions = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): InputItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction1(onErrorClick))
    if (onExtraClick != null) __obj.updateDynamic("onExtraClick")(js.Any.fromFunction1(onExtraClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputItemProps]
  }
}

