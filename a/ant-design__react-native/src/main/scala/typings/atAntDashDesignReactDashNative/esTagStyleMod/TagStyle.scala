package typings.atAntDashDesignReactDashNative.esTagStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagStyle extends js.Object {
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

object TagStyle {
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
  ): TagStyle = {
    val __obj = js.Dynamic.literal(activeText = activeText, activeWrap = activeWrap, close = close, closeAndroid = closeAndroid, closeIOS = closeIOS, closeText = closeText, closeTransform = closeTransform, disabledText = disabledText, disabledWrap = disabledWrap, normalText = normalText, normalWrap = normalWrap, tag = tag, text = text, textSmall = textSmall, wrap = wrap, wrapSmall = wrapSmall)
  
    __obj.asInstanceOf[TagStyle]
  }
}

