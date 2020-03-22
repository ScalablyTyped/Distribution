package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOkText extends js.Object {
  var cancelText: String
  var okText: String
}

object AnonOkText {
  @scala.inline
  def apply(cancelText: String, okText: String): AnonOkText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOkText]
  }
}

