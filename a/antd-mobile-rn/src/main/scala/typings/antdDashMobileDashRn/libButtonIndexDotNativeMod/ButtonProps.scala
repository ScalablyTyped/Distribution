package typings.antdDashMobileDashRn.libButtonIndexDotNativeMod

import typings.antdDashMobileDashRn.Anon_Container
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.ghost
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.large
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.primary
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.small
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.warning
import typings.antdDashMobileDashRn.libButtonPropsTypeMod.ButtonPropsType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ButtonProps extends ButtonPropsType {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* _ */ js.UndefOr[js.Any], Unit]] = js.undefined
  var styles: js.UndefOr[Anon_Container] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: /* _ */ js.UndefOr[js.Any] => Unit = null,
    size: large | small = null,
    styles: Anon_Container = null,
    `type`: primary | warning | ghost = null
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

