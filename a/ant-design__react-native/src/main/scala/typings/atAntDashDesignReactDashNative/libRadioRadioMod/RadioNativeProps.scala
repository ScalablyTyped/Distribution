package typings.atAntDashDesignReactDashNative.libRadioRadioMod

import typings.atAntDashDesignReactDashNative.Anon_Target
import typings.atAntDashDesignReactDashNative.libRadioPropsTypeMod.RadioPropsType
import typings.atAntDashDesignReactDashNative.libRadioStyleMod.RadioStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioNativeProps
  extends RadioPropsType
     with WithThemeStyles[RadioStyle] {
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object RadioNativeProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ Anon_Target => Unit = null,
    style: StyleProp[TextStyle] = null,
    styles: Partial[RadioStyle] = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
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

