package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonText extends js.Object {
  var buttonText: String
  var cancelText: String
  var okText: String
}

object AnonButtonText {
  @scala.inline
  def apply(buttonText: String, cancelText: String, okText: String): AnonButtonText = {
    val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonText]
  }
}

