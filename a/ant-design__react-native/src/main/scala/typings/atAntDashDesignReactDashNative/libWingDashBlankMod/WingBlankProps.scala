package typings.atAntDashDesignReactDashNative.libWingDashBlankMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.lg
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.md
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.sm
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps extends js.Object {
  var size: js.UndefOr[sm | md | lg] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(size: sm | md | lg = null, style: StyleProp[ViewStyle] = null): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankProps]
  }
}

