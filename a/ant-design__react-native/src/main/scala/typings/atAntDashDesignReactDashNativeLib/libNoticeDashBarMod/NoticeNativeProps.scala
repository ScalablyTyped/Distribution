package typings
package atAntDashDesignReactDashNativeLib.libNoticeDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps
  extends atAntDashDesignReactDashNativeLib.libNoticeDashBarPropsTypeMod.NoticeBarPropsType
     with atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libNoticeDashBarStyleMod.NoticeBarStyle] {
  var marqueeProps: js.UndefOr[atAntDashDesignReactDashNativeLib.libNoticeDashBarMarqueeMod.MarqueeProps] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactElement = null,
    icon: reactLib.reactMod.ReactElement = null,
    marqueeProps: atAntDashDesignReactDashNativeLib.libNoticeDashBarMarqueeMod.MarqueeProps = null,
    mode: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.closable | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.link = null,
    onPress: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libNoticeDashBarStyleMod.NoticeBarStyle] = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

