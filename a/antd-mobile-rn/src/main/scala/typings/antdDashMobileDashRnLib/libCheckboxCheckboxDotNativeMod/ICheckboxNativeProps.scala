package typings
package antdDashMobileDashRnLib.libCheckboxCheckboxDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxNativeProps
  extends antdDashMobileDashRnLib.libCheckboxPropsTypeMod.CheckboxPropsType {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.libCheckboxStyleIndexDotNativeMod.ICheckboxStyle] = js.undefined
}

object ICheckboxNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* params */ antdDashMobileDashRnLib.libCheckboxPropsTypeMod.OnChangeParams => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle] = null,
    styles: antdDashMobileDashRnLib.libCheckboxStyleIndexDotNativeMod.ICheckboxStyle = null
  ): ICheckboxNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ICheckboxNativeProps]
  }
}

