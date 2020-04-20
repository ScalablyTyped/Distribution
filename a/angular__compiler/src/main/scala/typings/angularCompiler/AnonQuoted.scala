package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuoted extends js.Object {
  var key: String
  var quoted: Boolean
}

object AnonQuoted {
  @scala.inline
  def apply(key: String, quoted: Boolean): AnonQuoted = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuoted]
  }
}

