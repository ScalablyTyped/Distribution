package typings.antdDashMobile.libActionDashSheetMod

import typings.antdDashMobile.antdDashMobileStrings.large
import typings.antdDashMobile.antdDashMobileStrings.small
import typings.antdDashMobile.libBadgeMod.BadgeProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgesOption extends BadgeProps {
  var index: Double
}

object BadgesOption {
  @scala.inline
  def apply(
    index: Double,
    className: String = null,
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    hot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: Int | Double = null,
    prefixCls: String = null,
    size: large | small = null,
    style: CSSProperties = null,
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

