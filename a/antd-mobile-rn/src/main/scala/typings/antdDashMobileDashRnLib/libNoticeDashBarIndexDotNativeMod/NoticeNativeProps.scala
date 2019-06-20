package typings
package antdDashMobileDashRnLib.libNoticeDashBarIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps
  extends antdDashMobileDashRnLib.libNoticeDashBarPropsTypeMod.NoticeBarPropsType {
  var marqueeProps: js.UndefOr[antdDashMobileDashRnLib.libNoticeDashBarMarqueeDotNativeMod.MarqueeProps] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.libNoticeDashBarStyleIndexDotNativeMod.INoticeBarStyle] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactElement = null,
    icon: reactLib.reactMod.ReactElement = null,
    marqueeProps: antdDashMobileDashRnLib.libNoticeDashBarMarqueeDotNativeMod.MarqueeProps = null,
    mode: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.closable | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.link = null,
    onClick: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.libNoticeDashBarStyleIndexDotNativeMod.INoticeBarStyle = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

