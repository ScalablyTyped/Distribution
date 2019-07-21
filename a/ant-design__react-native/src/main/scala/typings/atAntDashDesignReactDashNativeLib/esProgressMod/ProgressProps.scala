package typings
package atAntDashDesignReactDashNativeLib.esProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps
  extends atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esProgressStyleMod.ProgressStyle] {
  var appearTransition: js.UndefOr[scala.Boolean] = js.undefined
  var barStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.fixed | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.normal
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var unfilled: js.UndefOr[scala.Boolean] = js.undefined
  var wrapWidth: js.UndefOr[scala.Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[scala.Boolean] = js.undefined,
    barStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    percent: scala.Int | scala.Double = null,
    position: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.fixed | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.normal = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esProgressStyleMod.ProgressStyle] = null,
    unfilled: js.UndefOr[scala.Boolean] = js.undefined,
    wrapWidth: scala.Int | scala.Double = null
  ): ProgressProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled)
    if (wrapWidth != null) __obj.updateDynamic("wrapWidth")(wrapWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressProps]
  }
}

