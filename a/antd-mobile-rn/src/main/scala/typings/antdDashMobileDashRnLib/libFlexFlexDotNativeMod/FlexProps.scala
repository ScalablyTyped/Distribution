package typings
package antdDashMobileDashRnLib.libFlexFlexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps
  extends antdDashMobileDashRnLib.libFlexPropsTypeMod.FlexPropsType {
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply(
    align: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.start | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.end | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.baseline | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.stretch = null,
    children: reactLib.reactMod.ReactNode = null,
    direction: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.row | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`row-reverse` | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.column | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`column-reverse` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    justify: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.start | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.end | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.between | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.around = null,
    onLongPress: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    onPressIn: () => scala.Unit = null,
    onPressOut: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    wrap: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.nowrap | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.wrap | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`wrap-reverse` = null
  ): FlexProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps]
  }
}

