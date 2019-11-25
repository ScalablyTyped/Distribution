package typings.atAntDashDesignReactDashNative.esCardCardBodyMod

import typings.atAntDashDesignReactDashNative.PickCardStylebody
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends WithThemeStyles[PickCardStylebody] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(style: StyleProp[ViewStyle] = null, styles: Partial[PickCardStylebody] = null): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardBodyProps]
  }
}

