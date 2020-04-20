package typings.awesomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String | js.Any
  var value: String | js.Any
}

object AnonLabel {
  @scala.inline
  def apply(label: String | js.Any, value: String | js.Any): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

