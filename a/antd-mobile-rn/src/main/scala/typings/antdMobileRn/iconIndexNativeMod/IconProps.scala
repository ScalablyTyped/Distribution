package typings.antdMobileRn.iconIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.lg
import typings.antdMobileRn.antdMobileRnStrings.md
import typings.antdMobileRn.antdMobileRnStrings.sm
import typings.antdMobileRn.antdMobileRnStrings.xs
import typings.antdMobileRn.antdMobileRnStrings.xxs
import typings.antdMobileRn.iconPropsTypeMod.IconPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends IconPropsType {
  var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    `type`: String,
    color: String = null,
    size: xxs | xs | sm | md | lg | Double = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

