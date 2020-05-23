package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelText extends js.Object {
  var cancelText: String
  var justOkText: String
  var okText: String
}

object CancelText {
  @scala.inline
  def apply(cancelText: String, justOkText: String, okText: String): CancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelText]
  }
}

