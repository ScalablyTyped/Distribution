package typings.antdMobileRn.searchBarIndexNativeMod

import typings.antdMobileRn.anon.NativeEvent
import typings.antdMobileRn.searchBarPropsTypeMod.SearchBarPropsType
import typings.antdMobileRn.searchBarStyleIndexNativeMod.ISearchBarStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarNativeProps extends SearchBarPropsType {
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  @JSName("styles")
  var styles_SearchBarNativeProps: ISearchBarStyle
}

object SearchBarNativeProps {
  @scala.inline
  def apply(
    styles: ISearchBarStyle,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelText: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    onBlur: () => Unit = null,
    onCancel: /* value */ String => Unit = null,
    onChange: /* value */ String => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onClear: /* value */ String => Unit = null,
    onFocus: () => Unit = null,
    onSubmit: /* value */ String => Unit = null,
    onSubmitEditing: /* event */ NativeEvent => Unit = null,
    placeholder: String = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    value: String = null
  ): SearchBarNativeProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarNativeProps]
  }
}

