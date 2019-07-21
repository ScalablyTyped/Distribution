package typings
package atAntDashDesignReactDashNativeLib.libWhiteDashSpaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends js.Object {
  var size: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.xs | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.sm | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.md | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.lg | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.xl
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(
    size: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.xs | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.sm | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.md | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.lg | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.xl = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

