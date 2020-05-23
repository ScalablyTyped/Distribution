package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** 按钮 */
  var buttonText: String
  /** 取消 */
  var cancelText: String
  /** 确定 */
  var okText: String
}

object ButtonText {
  @scala.inline
  def apply(buttonText: String, cancelText: String, okText: String): ButtonText = {
    val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
}

