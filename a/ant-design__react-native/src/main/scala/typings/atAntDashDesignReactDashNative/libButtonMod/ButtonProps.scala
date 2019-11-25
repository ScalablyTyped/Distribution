package typings.atAntDashDesignReactDashNative.libButtonMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ghost
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.large
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.primary
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.small
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.warning
import typings.atAntDashDesignReactDashNative.libButtonPropsTypeMod.ButtonPropsType
import typings.atAntDashDesignReactDashNative.libButtonStyleMod.ButtonStyles
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TouchableHighlightProperties * / any */ trait ButtonProps
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

