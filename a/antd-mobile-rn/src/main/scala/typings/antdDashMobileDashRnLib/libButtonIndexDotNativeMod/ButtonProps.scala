package typings
package antdDashMobileDashRnLib.libButtonIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ButtonProps
  extends antdDashMobileDashRnLib.libButtonPropsTypeMod.ButtonPropsType {
  var activeStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* _ */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.Anon_Container] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: /* _ */ js.UndefOr[js.Any] => scala.Unit = null,
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.large | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.small = null,
    styles: antdDashMobileDashRnLib.Anon_Container = null,
    `type`: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.primary | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.warning | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.ghost = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

