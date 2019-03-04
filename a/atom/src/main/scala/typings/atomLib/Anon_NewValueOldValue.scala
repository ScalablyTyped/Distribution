package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValue extends js.Object {
  var newValue: js.Array[java.lang.String]
  var oldValue: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_NewValueOldValue {
  @scala.inline
  def apply(newValue: js.Array[java.lang.String], oldValue: js.Array[java.lang.String] = null): Anon_NewValueOldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValue]
  }
}

