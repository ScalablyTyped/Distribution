package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDismissText extends js.Object {
  var dismissText: String
  var extra: String
  var okText: String
}

object AnonDismissText {
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): AnonDismissText = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDismissText]
  }
}

