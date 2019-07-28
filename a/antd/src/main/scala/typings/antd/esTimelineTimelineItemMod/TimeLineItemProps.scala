package typings.antd.esTimelineTimelineItemMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeLineItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dot: js.UndefOr[ReactNode] = js.undefined
  var pending: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimeLineItemProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    dot: ReactNode = null,
    pending: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): TimeLineItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dot != null) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    if (position != null) __obj.updateDynamic("position")(position)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TimeLineItemProps]
  }
}

