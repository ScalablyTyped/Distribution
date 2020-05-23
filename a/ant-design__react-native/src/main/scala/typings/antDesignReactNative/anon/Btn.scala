package typings.antDesignReactNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Btn extends js.Object {
  var btn: RegisteredStyle[ViewStyle]
  var cancelBtn: RegisteredStyle[ViewStyle]
  var cancelBtnMask: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var content: RegisteredStyle[ViewStyle]
  var destructiveBtn: RegisteredStyle[TextStyle]
  var mask: RegisteredStyle[ViewStyle]
  var message: RegisteredStyle[ViewStyle]
  var title: RegisteredStyle[ViewStyle]
  var titleText: RegisteredStyle[TextStyle]
  var wrap: RegisteredStyle[ViewStyle]
}

object Btn {
  @scala.inline
  def apply(
    btn: RegisteredStyle[ViewStyle],
    cancelBtn: RegisteredStyle[ViewStyle],
    cancelBtnMask: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle],
    destructiveBtn: RegisteredStyle[TextStyle],
    mask: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[ViewStyle],
    title: RegisteredStyle[ViewStyle],
    titleText: RegisteredStyle[TextStyle],
    wrap: RegisteredStyle[ViewStyle]
  ): Btn = {
    val __obj = js.Dynamic.literal(btn = btn.asInstanceOf[js.Any], cancelBtn = cancelBtn.asInstanceOf[js.Any], cancelBtnMask = cancelBtnMask.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], destructiveBtn = destructiveBtn.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Btn]
  }
}

