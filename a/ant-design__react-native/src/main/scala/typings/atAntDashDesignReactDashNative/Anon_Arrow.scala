package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arrow extends js.Object {
  var arrow: RegisteredStyle[TextStyle]
  var container: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[ViewStyle]
  var contentText: RegisteredStyle[TextStyle]
  var header: RegisteredStyle[ViewStyle]
  var headerText: RegisteredStyle[TextStyle]
  var headerWrap: RegisteredStyle[ViewStyle]
}

object Anon_Arrow {
  @scala.inline
  def apply(
    arrow: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle],
    contentText: RegisteredStyle[TextStyle],
    header: RegisteredStyle[ViewStyle],
    headerText: RegisteredStyle[TextStyle],
    headerWrap: RegisteredStyle[ViewStyle]
  ): Anon_Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arrow]
  }
}

