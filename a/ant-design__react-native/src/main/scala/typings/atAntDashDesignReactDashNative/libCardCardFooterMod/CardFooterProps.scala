package typings.atAntDashDesignReactDashNative.libCardCardFooterMod

import typings.atAntDashDesignReactDashNative.PickCardStylefooterContentfooterExtrafooterWrap
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps
  extends CardFooterPropsType
     with WithThemeStyles[PickCardStylefooterContentfooterExtrafooterWrap] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: ReactNode = null,
    extra: ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PickCardStylefooterContentfooterExtrafooterWrap] = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CardFooterProps]
  }
}

