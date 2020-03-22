package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var error: String
  var value: String
}

object AnonValue {
  @scala.inline
  def apply(error: String, value: String): AnonValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

