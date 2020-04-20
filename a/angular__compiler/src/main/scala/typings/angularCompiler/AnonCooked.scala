package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCooked extends js.Object {
  var cooked: String
  var raw: String
}

object AnonCooked {
  @scala.inline
  def apply(cooked: String, raw: String): AnonCooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCooked]
  }
}

