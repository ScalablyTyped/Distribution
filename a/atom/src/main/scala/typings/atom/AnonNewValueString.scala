package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueString extends js.Object {
  var newValue: String
  var oldValue: js.UndefOr[String] = js.undefined
}

object AnonNewValueString {
  @scala.inline
  def apply(newValue: String, oldValue: String = null): AnonNewValueString = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueString]
  }
}

