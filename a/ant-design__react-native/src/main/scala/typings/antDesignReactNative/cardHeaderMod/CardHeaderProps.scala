package typings.antDesignReactNative.cardHeaderMod

import typings.antDesignReactNative.PickCardStyleheaderConten
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends CardHeaderPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    extra: ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PickCardStyleheaderConten] = null,
    thumb: ReactNode = null,
    thumbStyle: StyleProp[ImageStyle] = null,
    title: ReactNode = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

