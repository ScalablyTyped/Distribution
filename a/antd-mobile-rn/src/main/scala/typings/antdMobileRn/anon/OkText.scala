package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OkText extends js.Object {
  var dismissText: String
  var extra: String
  var okText: String
}

object OkText {
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): OkText = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkText]
  }
}

