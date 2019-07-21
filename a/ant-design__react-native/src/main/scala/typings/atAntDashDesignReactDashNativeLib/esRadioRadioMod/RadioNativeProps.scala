package typings
package atAntDashDesignReactDashNativeLib.esRadioRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioNativeProps
  extends atAntDashDesignReactDashNativeLib.esRadioPropsTypeMod.RadioPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esRadioStyleMod.RadioStyle] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object RadioNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: /* e */ atAntDashDesignReactDashNativeLib.Anon_Target => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esRadioStyleMod.RadioStyle] = null,
    wrapLabel: js.UndefOr[scala.Boolean] = js.undefined
  ): RadioNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel)
    __obj.asInstanceOf[RadioNativeProps]
  }
}

