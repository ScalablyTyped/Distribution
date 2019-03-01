package typings
package antdLib.libTimelineTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[
    antdLib.antdLibStrings.left | antdLib.antdLibStrings.alternate | antdLib.antdLibStrings.right
  ] = js.undefined
  /** 指定最后一个幽灵节点是否存在或内容 */
  var pending: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var pendingDot: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TimelineProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    mode: antdLib.antdLibStrings.left | antdLib.antdLibStrings.alternate | antdLib.antdLibStrings.right = null,
    pending: reactLib.reactMod.ReactNs.ReactNode = null,
    pendingDot: reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TimelineProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (pendingDot != null) __obj.updateDynamic("pendingDot")(pendingDot.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TimelineProps]
  }
}

