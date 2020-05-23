package typings.antDesignReactNative.checkboxItemMod

import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typings.antDesignReactNative.checkboxPropsTypeMod.OnChangeParams
import typings.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxItemProps
  extends CheckboxItemPropsType
     with WithThemeStyles[CheckboxStyle] {
  var checkboxStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CheckboxItemProps {
  @scala.inline
  def apply(
    checkboxStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    onChange: /* params */ OnChangeParams => Unit = null,
    onPress: /* e */ js.UndefOr[js.Any] => Unit = null,
    prefixCls: String = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[CheckboxStyle] = null
  ): CheckboxItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkboxStyle)) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxItemProps]
  }
}

