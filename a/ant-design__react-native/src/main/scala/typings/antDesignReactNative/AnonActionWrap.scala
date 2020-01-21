package typings.antDesignReactNative

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionWrap extends js.Object {
  var actionWrap: RegisteredStyle[ViewStyle]
  var close: RegisteredStyle[TextStyle]
  var container: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[TextStyle]
  var left15: RegisteredStyle[ViewStyle]
  var left6: RegisteredStyle[ViewStyle]
  var link: RegisteredStyle[TextStyle]
  var notice: RegisteredStyle[ViewStyle]
}

object AnonActionWrap {
  @scala.inline
  def apply(
    actionWrap: RegisteredStyle[ViewStyle],
    close: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[TextStyle],
    left15: RegisteredStyle[ViewStyle],
    left6: RegisteredStyle[ViewStyle],
    link: RegisteredStyle[TextStyle],
    notice: RegisteredStyle[ViewStyle]
  ): AnonActionWrap = {
    val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionWrap]
  }
}

