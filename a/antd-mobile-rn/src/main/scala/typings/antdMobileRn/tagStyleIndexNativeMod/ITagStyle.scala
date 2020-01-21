package typings.antdMobileRn.tagStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagStyle extends js.Object {
  var activeText: TextStyle
  var activeWrap: ViewStyle
  var close: ViewStyle
  var closeAndroid: ViewStyle
  var closeIOS: ViewStyle
  var closeText: TextStyle
  var closeTransform: ViewStyle
  var disabledText: TextStyle
  var disabledWrap: ViewStyle
  var normalText: TextStyle
  var normalWrap: ViewStyle
  var tag: ViewStyle
  var text: TextStyle
  var textSmall: TextStyle
  var wrap: ViewStyle
  var wrapSmall: ViewStyle
}

object ITagStyle {
  @scala.inline
  def apply(
    activeText: TextStyle,
    activeWrap: ViewStyle,
    close: ViewStyle,
    closeAndroid: ViewStyle,
    closeIOS: ViewStyle,
    closeText: TextStyle,
    closeTransform: ViewStyle,
    disabledText: TextStyle,
    disabledWrap: ViewStyle,
    normalText: TextStyle,
    normalWrap: ViewStyle,
    tag: ViewStyle,
    text: TextStyle,
    textSmall: TextStyle,
    wrap: ViewStyle,
    wrapSmall: ViewStyle
  ): ITagStyle = {
    val __obj = js.Dynamic.literal(activeText = activeText.asInstanceOf[js.Any], activeWrap = activeWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeAndroid = closeAndroid.asInstanceOf[js.Any], closeIOS = closeIOS.asInstanceOf[js.Any], closeText = closeText.asInstanceOf[js.Any], closeTransform = closeTransform.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], disabledWrap = disabledWrap.asInstanceOf[js.Any], normalText = normalText.asInstanceOf[js.Any], normalWrap = normalWrap.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textSmall = textSmall.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapSmall = wrapSmall.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITagStyle]
  }
}

