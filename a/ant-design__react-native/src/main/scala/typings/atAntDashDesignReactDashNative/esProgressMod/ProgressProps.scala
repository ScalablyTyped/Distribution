package typings.atAntDashDesignReactDashNative.esProgressMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.fixed
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.normal
import typings.atAntDashDesignReactDashNative.esProgressStyleMod.ProgressStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps extends WithThemeStyles[ProgressStyle] {
  var appearTransition: js.UndefOr[Boolean] = js.undefined
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[fixed | normal] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var unfilled: js.UndefOr[Boolean] = js.undefined
  var wrapWidth: js.UndefOr[Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: StyleProp[ViewStyle] = null,
    percent: Int | Double = null,
    position: fixed | normal = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ProgressStyle] = null,
    unfilled: js.UndefOr[Boolean] = js.undefined,
    wrapWidth: Int | Double = null
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

