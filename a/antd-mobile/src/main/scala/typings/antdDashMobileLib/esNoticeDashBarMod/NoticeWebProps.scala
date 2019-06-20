package typings
package antdDashMobileLib.esNoticeDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeWebProps
  extends antdDashMobileLib.esNoticeDashBarPropsTypeMod.NoticeBarPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var marqueeProps: js.UndefOr[antdDashMobileLib.esNoticeDashBarMarqueeMod.MarqueeProps] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object NoticeWebProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactElement = null,
    className: java.lang.String = null,
    icon: reactLib.reactMod.ReactElement = null,
    marqueeProps: antdDashMobileLib.esNoticeDashBarMarqueeMod.MarqueeProps = null,
    mode: antdDashMobileLib.antdDashMobileLibStrings.closable | antdDashMobileLib.antdDashMobileLibStrings.link = null,
    onClick: () => scala.Unit = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): NoticeWebProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NoticeWebProps]
  }
}

