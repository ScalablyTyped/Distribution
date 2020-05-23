package typings.antDesignReactNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dot extends js.Object {
  var dot: RegisteredStyle[ViewStyle]
  var dotSizelarge: RegisteredStyle[ViewStyle]
  var text: RegisteredStyle[TextStyle]
  var textCorner: RegisteredStyle[ViewStyle]
  var textCornerWrap: RegisteredStyle[ViewStyle]
  var textCornerlarge: RegisteredStyle[ViewStyle]
  var textDom: RegisteredStyle[ViewStyle]
  var wrap: RegisteredStyle[ViewStyle]
}

object Dot {
  @scala.inline
  def apply(
    dot: RegisteredStyle[ViewStyle],
    dotSizelarge: RegisteredStyle[ViewStyle],
    text: RegisteredStyle[TextStyle],
    textCorner: RegisteredStyle[ViewStyle],
    textCornerWrap: RegisteredStyle[ViewStyle],
    textCornerlarge: RegisteredStyle[ViewStyle],
    textDom: RegisteredStyle[ViewStyle],
    wrap: RegisteredStyle[ViewStyle]
  ): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
}

