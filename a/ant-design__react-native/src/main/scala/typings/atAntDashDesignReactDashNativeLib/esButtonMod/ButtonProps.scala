package typings
package atAntDashDesignReactDashNativeLib.esButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ButtonProps
  extends atAntDashDesignReactDashNativeLib.esButtonPropsTypeMod.ButtonPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esButtonStyleMod.ButtonStyles] {
  var activeStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* _ */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onPress: /* _ */ js.UndefOr[js.Any] => scala.Unit = null,
    size: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esButtonStyleMod.ButtonStyles] = null,
    `type`: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.primary | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.warning | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ghost = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

