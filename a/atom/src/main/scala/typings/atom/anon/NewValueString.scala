package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueString extends js.Object {
  var newValue: String
  var oldValue: js.UndefOr[String] = js.undefined
}

object NewValueString {
  @scala.inline
  def apply(newValue: String, oldValue: String = null): NewValueString = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueString]
  }
}

