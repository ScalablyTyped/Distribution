package typings.awesomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var label: String
  var value: js.Any
}

object AnonValue {
  @scala.inline
  def apply(label: String, value: js.Any): AnonValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

