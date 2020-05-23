package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextText extends js.Object {
  var nextText: String
  var prevText: String
}

object NextText {
  @scala.inline
  def apply(nextText: String, prevText: String): NextText = {
    val __obj = js.Dynamic.literal(nextText = nextText.asInstanceOf[js.Any], prevText = prevText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextText]
  }
}

