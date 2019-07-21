package typings
package atAntDashDesignReactDashNativeLib.libCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends atAntDashDesignReactDashNativeLib.libCheckboxPropsTypeMod.CheckboxPropsType
     with atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libCheckboxStyleMod.CheckboxStyle] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* params */ atAntDashDesignReactDashNativeLib.libCheckboxPropsTypeMod.OnChangeParams => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libCheckboxStyleMod.CheckboxStyle] = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CheckboxProps]
  }
}

