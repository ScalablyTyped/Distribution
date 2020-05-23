package typings.antdMobile.noticeBarMod

import typings.antdMobile.antdMobileStrings.closable
import typings.antdMobile.antdMobileStrings.link
import typings.antdMobile.marqueeMod.MarqueeProps
import typings.antdMobile.noticeBarPropsTypeMod.NoticeBarPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
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
    icon: js.UndefOr[Null | ReactElement] = js.undefined,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: () => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): NoticeWebProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeWebProps]
  }
}

