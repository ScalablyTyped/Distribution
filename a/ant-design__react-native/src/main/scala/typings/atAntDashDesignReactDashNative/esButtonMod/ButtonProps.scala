package typings.atAntDashDesignReactDashNative.esButtonMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ghost
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.large
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.primary
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.small
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.warning
import typings.atAntDashDesignReactDashNative.esButtonPropsTypeMod.ButtonPropsType
import typings.atAntDashDesignReactDashNative.esButtonStyleMod.ButtonStyles
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ButtonProps
  extends ButtonPropsType
     with WithThemeStyles[ButtonStyles] {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* _ */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onPress: /* _ */ js.UndefOr[js.Any] => Unit = null,
    size: large | small = null,
    styles: Partial[ButtonStyles] = null,
    `type`: primary | warning | ghost = null
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

