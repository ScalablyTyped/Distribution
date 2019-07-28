package typings.antdDashMobile.esProgressMod

import typings.antdDashMobile.antdDashMobileStrings.fixed
import typings.antdDashMobile.antdDashMobileStrings.normal
import typings.antdDashMobile.esProgressPropsTypeMod.ProgressPropsType
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps extends ProgressPropsType {
  var barStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: CSSProperties = null,
    className: String = null,
    percent: Int | Double = null,
    position: fixed | normal = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    unfilled: js.UndefOr[Boolean] = js.undefined
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

