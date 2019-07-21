package typings
package atAntDashDesignReactDashNativeLib.esCardCardFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps
  extends CardFooterPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[
      stdLib.Pick[
        atAntDashDesignReactDashNativeLib.esCardStyleMod.CardStyle, 
        atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.footerContent | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.footerExtra | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.footerWrap
      ]
    ] {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNode = null,
    extra: reactLib.reactMod.ReactNode = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[
      stdLib.Pick[
        atAntDashDesignReactDashNativeLib.esCardStyleMod.CardStyle, 
        atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.footerContent | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.footerExtra | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.footerWrap
      ]
    ] = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CardFooterProps]
  }
}

