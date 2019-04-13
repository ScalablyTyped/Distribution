package typings
package antdDashMobileLib.libActionDashSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgesOption
  extends antdDashMobileLib.libBadgeMod.BadgeProps {
  var index: scala.Double
}

object BadgesOption {
  @scala.inline
  def apply(
    index: scala.Double,
    className: java.lang.String = null,
    corner: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    hot: js.UndefOr[scala.Boolean] = js.undefined,
    overflowCount: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.large | antdDashMobileLib.antdDashMobileLibStrings.small = null,
    style: reactLib.reactMod.CSSProperties = null,
    text: js.Any = null
  ): BadgesOption = {
    val __obj = js.Dynamic.literal(index = index)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(hot)) __obj.updateDynamic("hot")(hot)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BadgesOption]
  }
}

