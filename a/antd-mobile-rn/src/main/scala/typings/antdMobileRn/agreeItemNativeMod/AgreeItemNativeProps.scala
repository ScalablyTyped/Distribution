package typings.antdMobileRn.agreeItemNativeMod

import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import typings.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typings.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgreeItemNativeProps extends CheckboxPropsType {
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[ICheckboxStyle] = js.undefined
}

object AgreeItemNativeProps {
  @scala.inline
  def apply(
    checkboxStyle: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: ICheckboxStyle = null
  ): AgreeItemNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkboxStyle)) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgreeItemNativeProps]
  }
}

