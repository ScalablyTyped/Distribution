package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValue extends js.Object {
  var newValue: js.Array[String]
  var oldValue: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_NewValueOldValue {
  @scala.inline
  def apply(newValue: js.Array[String], oldValue: js.Array[String] = null): Anon_NewValueOldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValue]
  }
}

