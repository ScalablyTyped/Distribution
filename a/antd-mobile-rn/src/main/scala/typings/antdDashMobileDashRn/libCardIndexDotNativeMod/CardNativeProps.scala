package typings.antdDashMobileDashRn.libCardIndexDotNativeMod

import typings.antdDashMobileDashRn.libCardPropsTypeMod.CardPropsType
import typings.antdDashMobileDashRn.libCardStyleIndexDotNativeMod.ICardStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardNativeProps extends CardPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[ICardStyle] = js.undefined
}

object CardNativeProps {
  @scala.inline
  def apply(
    full: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: ICardStyle = null
  ): CardNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CardNativeProps]
  }
}

