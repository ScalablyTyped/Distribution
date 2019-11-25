package typings.atAntDashDesignReactDashNative.esCheckboxCheckboxMod

import typings.atAntDashDesignReactDashNative.esCheckboxPropsTypeMod.CheckboxPropsType
import typings.atAntDashDesignReactDashNative.esCheckboxPropsTypeMod.OnChangeParams
import typings.atAntDashDesignReactDashNative.esCheckboxStyleMod.CheckboxStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends CheckboxPropsType
     with WithThemeStyles[CheckboxStyle] {
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Unit = null,
    style: StyleProp[TextStyle] = null,
    styles: Partial[CheckboxStyle] = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

