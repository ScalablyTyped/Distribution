package typings.atAntDashDesignReactDashNative.esSearchDashBarMod

import typings.atAntDashDesignReactDashNative.Anon_NativeEvent
import typings.atAntDashDesignReactDashNative.esSearchDashBarPropsTypeMod.SearchBarPropsType
import typings.atAntDashDesignReactDashNative.esSearchDashBarStyleMod.SearchBarStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarProps
  extends SearchBarPropsType
     with WithThemeStyles[SearchBarStyle] {
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ Anon_NativeEvent, Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object SearchBarProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelText: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onBlur: () => Unit = null,
    onCancel: /* value */ String => Unit = null,
    onChange: /* value */ String => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onClear: /* value */ String => Unit = null,
    onFocus: () => Unit = null,
    onSubmit: /* value */ String => Unit = null,
    onSubmitEditing: /* event */ Anon_NativeEvent => Unit = null,
    placeholder: String = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    styles: Partial[SearchBarStyle] = null,
    value: String = null
  ): SearchBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchBarProps]
  }
}

