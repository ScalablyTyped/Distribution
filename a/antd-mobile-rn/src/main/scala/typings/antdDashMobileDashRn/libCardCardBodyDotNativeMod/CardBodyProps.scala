package typings.antdDashMobileDashRn.libCardCardBodyDotNativeMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends js.Object {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(style: StyleProp[ViewStyle] = null, styles: js.Any = null): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[CardBodyProps]
  }
}

