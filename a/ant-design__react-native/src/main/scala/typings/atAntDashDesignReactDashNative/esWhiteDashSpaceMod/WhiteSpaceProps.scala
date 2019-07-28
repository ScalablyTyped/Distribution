package typings.atAntDashDesignReactDashNative.esWhiteDashSpaceMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.lg
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.md
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.sm
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.xl
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.xs
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends js.Object {
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null, style: StyleProp[ViewStyle] = null): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

