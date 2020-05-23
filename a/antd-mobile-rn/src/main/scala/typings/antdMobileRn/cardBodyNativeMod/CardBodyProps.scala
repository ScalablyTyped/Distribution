package typings.antdMobileRn.cardBodyNativeMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends js.Object {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined, styles: js.Any = null): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardBodyProps]
  }
}

