package typings
package antdDashMobileLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends antdDashMobileLib.libBadgePropsTypeMod.BadgePropsTypes {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var hot: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    corner: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    hot: js.UndefOr[scala.Boolean] = js.undefined,
    overflowCount: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.large | antdDashMobileLib.antdDashMobileLibStrings.small = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    text: js.Any = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BadgeProps]
  }
}

