package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyQuoted extends js.Object {
  var key: String
  var quoted: Boolean
}

object AnonKeyQuoted {
  @scala.inline
  def apply(key: String, quoted: Boolean): AnonKeyQuoted = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyQuoted]
  }
}

