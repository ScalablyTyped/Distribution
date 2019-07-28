package typings.antdDashMobile.esNoticeDashBarMod

import typings.antdDashMobile.antdDashMobileStrings.closable
import typings.antdDashMobile.antdDashMobileStrings.link
import typings.antdDashMobile.esNoticeDashBarMarqueeMod.MarqueeProps
import typings.antdDashMobile.esNoticeDashBarPropsTypeMod.NoticeBarPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeWebProps extends NoticeBarPropsType {
  var className: js.UndefOr[String] = js.undefined
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object NoticeWebProps {
  @scala.inline
  def apply(
    action: ReactElement = null,
    className: String = null,
    icon: ReactElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: () => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null
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

