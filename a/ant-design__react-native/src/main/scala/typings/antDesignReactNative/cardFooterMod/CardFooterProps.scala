package typings.antDesignReactNative.cardFooterMod

import typings.antDesignReactNative.anon.PickCardStylefooterConten
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps
  extends CardFooterPropsType
     with WithThemeStyles[PickCardStylefooterConten] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: ReactNode = null,
    extra: ReactNode = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[PickCardStylefooterConten] = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterProps]
  }
}

