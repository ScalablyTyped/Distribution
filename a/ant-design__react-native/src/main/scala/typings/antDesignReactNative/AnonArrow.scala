package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrow extends js.Object {
  var arrow: RegisteredStyle[TextStyle]
  var container: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[ViewStyle]
  var contentText: RegisteredStyle[TextStyle]
  var header: RegisteredStyle[ViewStyle]
  var headerText: RegisteredStyle[TextStyle]
  var headerWrap: RegisteredStyle[ViewStyle]
}

object AnonArrow {
  @scala.inline
  def apply(
    arrow: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle],
    contentText: RegisteredStyle[TextStyle],
    header: RegisteredStyle[ViewStyle],
    headerText: RegisteredStyle[TextStyle],
    headerWrap: RegisteredStyle[ViewStyle]
  ): AnonArrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrow]
  }
}

