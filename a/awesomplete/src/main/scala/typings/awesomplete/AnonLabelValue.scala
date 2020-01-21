package typings.awesomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValue extends js.Object {
  var label: String
  var value: js.Any
}

object AnonLabelValue {
  @scala.inline
  def apply(label: String, value: js.Any): AnonLabelValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabelValue]
  }
}

