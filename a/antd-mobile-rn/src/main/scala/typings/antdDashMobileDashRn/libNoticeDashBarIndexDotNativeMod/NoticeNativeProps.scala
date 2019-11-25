package typings.antdDashMobileDashRn.libNoticeDashBarIndexDotNativeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.closable
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.link
import typings.antdDashMobileDashRn.libNoticeDashBarMarqueeDotNativeMod.MarqueeProps
import typings.antdDashMobileDashRn.libNoticeDashBarPropsTypeMod.NoticeBarPropsType
import typings.antdDashMobileDashRn.libNoticeDashBarStyleIndexDotNativeMod.INoticeBarStyle
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps extends NoticeBarPropsType {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[INoticeBarStyle] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: ReactElement = null,
    icon: ReactElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: INoticeBarStyle = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

