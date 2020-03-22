package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldValue extends js.Object {
  var newValue: js.Array[String]
  var oldValue: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonOldValue {
  @scala.inline
  def apply(newValue: js.Array[String], oldValue: js.Array[String] = null): AnonOldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldValue]
  }
}

