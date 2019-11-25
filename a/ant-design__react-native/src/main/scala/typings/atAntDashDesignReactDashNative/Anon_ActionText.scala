package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionText extends js.Object {
  var actionText: RegisteredStyle[TextStyle]
  var dismissText: RegisteredStyle[TextStyle]
  var header: RegisteredStyle[ViewStyle]
  var headerItem: RegisteredStyle[ViewStyle]
  var modal: RegisteredStyle[ViewStyle]
  var okText: RegisteredStyle[TextStyle]
  var title: RegisteredStyle[TextStyle]
}

object Anon_ActionText {
  @scala.inline
  def apply(
    actionText: RegisteredStyle[TextStyle],
    dismissText: RegisteredStyle[TextStyle],
    header: RegisteredStyle[ViewStyle],
    headerItem: RegisteredStyle[ViewStyle],
    modal: RegisteredStyle[ViewStyle],
    okText: RegisteredStyle[TextStyle],
    title: RegisteredStyle[TextStyle]
  ): Anon_ActionText = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionText]
  }
}

