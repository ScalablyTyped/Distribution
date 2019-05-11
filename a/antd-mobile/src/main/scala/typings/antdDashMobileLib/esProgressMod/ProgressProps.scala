package typings
package antdDashMobileLib.esProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps
  extends antdDashMobileLib.esProgressPropsTypeMod.ProgressPropsType {
  var barStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[scala.Boolean] = js.undefined,
    barStyle: reactLib.reactMod.CSSProperties = null,
    className: java.lang.String = null,
    percent: scala.Int | scala.Double = null,
    position: antdDashMobileLib.antdDashMobileLibStrings.fixed | antdDashMobileLib.antdDashMobileLibStrings.normal = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    unfilled: js.UndefOr[scala.Boolean] = js.undefined
  ): ProgressProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled)
    __obj.asInstanceOf[ProgressProps]
  }
}

