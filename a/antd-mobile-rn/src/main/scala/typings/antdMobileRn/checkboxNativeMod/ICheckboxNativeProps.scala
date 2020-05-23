package typings.antdMobileRn.checkboxNativeMod

import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import typings.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typings.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxNativeProps extends CheckboxPropsType {
  var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var styles: js.UndefOr[ICheckboxStyle] = js.undefined
}

object ICheckboxNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Unit = null,
    style: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    styles: ICheckboxStyle = null
  ): ICheckboxNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxNativeProps]
  }
}

