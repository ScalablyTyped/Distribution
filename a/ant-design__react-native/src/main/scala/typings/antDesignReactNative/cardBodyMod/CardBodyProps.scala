package typings.antDesignReactNative.cardBodyMod

import typings.antDesignReactNative.anon.PickCardStylebody
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends WithThemeStyles[PickCardStylebody] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[PickCardStylebody] = null
  ): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardBodyProps]
  }
}

