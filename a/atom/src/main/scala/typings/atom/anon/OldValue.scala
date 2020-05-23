package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldValue extends js.Object {
  var newValue: js.Array[String]
  var oldValue: js.UndefOr[js.Array[String]] = js.undefined
}

object OldValue {
  @scala.inline
  def apply(newValue: js.Array[String], oldValue: js.Array[String] = null): OldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue]
  }
}

