package typings.antdDashMobileDashRn.libBadgeStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeStyle extends js.Object {
  var dot: ViewStyle
  var dotSizelarge: ViewStyle
  var text: TextStyle
  var textCorner: ViewStyle
  var textCornerWrap: ViewStyle
  var textCornerlarge: ViewStyle
  var textDom: ViewStyle
  var wrap: ViewStyle
}

object IBadgeStyle {
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
  ): IBadgeStyle = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBadgeStyle]
  }
}

