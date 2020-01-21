package typings.antDesignReactNative.noticeBarMod

import typings.antDesignReactNative.antDesignReactNativeStrings.closable
import typings.antDesignReactNative.antDesignReactNativeStrings.link
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.marqueeMod.MarqueeProps
import typings.antDesignReactNative.noticeBarPropsTypeMod.NoticeBarPropsType
import typings.antDesignReactNative.noticeBarStyleMod.NoticeBarStyle
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps
  extends NoticeBarPropsType
     with WithThemeStyles[NoticeBarStyle] {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: ReactElement = null,
    icon: ReactElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onPress: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[NoticeBarStyle] = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

