package typings.antdMobileRn.wingBlankIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.lg
import typings.antdMobileRn.antdMobileRnStrings.md
import typings.antdMobileRn.antdMobileRnStrings.sm
import typings.antdMobileRn.wingBlankPropsTypeMod.WingBlankPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps extends WingBlankPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(size: sm | md | lg = null, style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankProps]
  }
}

