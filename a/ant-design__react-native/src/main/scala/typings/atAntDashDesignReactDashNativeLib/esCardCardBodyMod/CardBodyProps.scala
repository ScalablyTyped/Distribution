package typings
package atAntDashDesignReactDashNativeLib.esCardCardBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps
  extends atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[
      stdLib.Pick[
        atAntDashDesignReactDashNativeLib.esCardStyleMod.CardStyle, 
        atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.body
      ]
    ] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[
      stdLib.Pick[
        atAntDashDesignReactDashNativeLib.esCardStyleMod.CardStyle, 
        atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.body
      ]
    ] = null
  ): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CardBodyProps]
  }
}

