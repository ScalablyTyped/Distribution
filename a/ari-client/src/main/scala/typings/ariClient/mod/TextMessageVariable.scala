package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMessageVariable extends js.Object {
  var key: String
  var value: String
}

object TextMessageVariable {
  @scala.inline
  def apply(key: String, value: String): TextMessageVariable = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessageVariable]
  }
}

