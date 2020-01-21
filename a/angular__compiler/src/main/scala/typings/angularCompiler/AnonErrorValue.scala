package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorValue extends js.Object {
  var error: String
  var value: String
}

object AnonErrorValue {
  @scala.inline
  def apply(error: String, value: String): AnonErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorValue]
  }
}

