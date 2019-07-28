package typings.atAntDashDesignReactDashNative.libBadgeStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeStyle extends js.Object {
  var dot: ViewStyle
  var dotSizelarge: ViewStyle
  var text: TextStyle
  var textCorner: ViewStyle
  var textCornerWrap: ViewStyle
  var textCornerlarge: ViewStyle
  var textDom: ViewStyle
  var wrap: ViewStyle
}

object BadgeStyle {
  @scala.inline
  def apply(
    dot: ViewStyle,
    dotSizelarge: ViewStyle,
    text: TextStyle,
    textCorner: ViewStyle,
    textCornerWrap: ViewStyle,
    textCornerlarge: ViewStyle,
    textDom: ViewStyle,
    wrap: ViewStyle
  ): BadgeStyle = {
    val __obj = js.Dynamic.literal(dot = dot, dotSizelarge = dotSizelarge, text = text, textCorner = textCorner, textCornerWrap = textCornerWrap, textCornerlarge = textCornerlarge, textDom = textDom, wrap = wrap)
  
    __obj.asInstanceOf[BadgeStyle]
  }
}

