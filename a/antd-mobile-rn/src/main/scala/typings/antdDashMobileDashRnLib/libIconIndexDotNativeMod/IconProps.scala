package typings
package antdDashMobileDashRnLib.libIconIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends antdDashMobileDashRnLib.libIconPropsTypeMod.IconPropsType {
  var size: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xxs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg | scala.Double
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    color: java.lang.String = null,
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xxs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

