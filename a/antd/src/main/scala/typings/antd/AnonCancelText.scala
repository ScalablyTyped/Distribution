package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelText extends js.Object {
  var cancelText: String
  var justOkText: String
  var okText: String
}

object AnonCancelText {
  @scala.inline
  def apply(cancelText: String, justOkText: String, okText: String): AnonCancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelText]
  }
}

