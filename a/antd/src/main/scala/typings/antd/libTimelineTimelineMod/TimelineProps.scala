package typings.antd.libTimelineTimelineMod

import typings.antd.antdStrings.alternate
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[left | alternate | right] = js.undefined
  /** 指定最后一个幽灵节点是否存在或内容 */
  var pending: js.UndefOr[ReactNode] = js.undefined
  var pendingDot: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimelineProps {
  @scala.inline
  def apply(
    className: String = null,
    mode: left | alternate | right = null,
    pending: ReactNode = null,
    pendingDot: ReactNode = null,
    prefixCls: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TimelineProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (pendingDot != null) __obj.updateDynamic("pendingDot")(pendingDot.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineProps]
  }
}

