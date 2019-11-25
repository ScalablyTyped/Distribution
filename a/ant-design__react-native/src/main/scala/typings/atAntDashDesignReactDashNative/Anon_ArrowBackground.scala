package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowBackground extends js.Object {
  var arrow: RegisteredStyle[ViewStyle]
  var background: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[ViewStyle]
}

object Anon_ArrowBackground {
  @scala.inline
  def apply(
    arrow: RegisteredStyle[ViewStyle],
    background: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle]
  ): Anon_ArrowBackground = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArrowBackground]
  }
}

