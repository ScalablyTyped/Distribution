package typings.antdMobileRn.checkboxItemNativeMod

import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxItemPropsType
import typings.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typings.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxItemNativeProps extends CheckboxItemPropsType {
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[ICheckboxStyle] = js.undefined
}

object ICheckboxItemNativeProps {
  @scala.inline
  def apply(
    checkboxStyle: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    onChange: /* params */ OnChangeParams => Unit = null,
    onClick: /* e */ js.UndefOr[js.Any] => Unit = null,
    prefixCls: String = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: ICheckboxStyle = null
  ): ICheckboxItemNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkboxStyle)) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxItemNativeProps]
  }
}

