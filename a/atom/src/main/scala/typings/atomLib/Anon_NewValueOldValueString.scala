package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueString extends js.Object {
  var newValue: java.lang.String
  var oldValue: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NewValueOldValueString {
  @scala.inline
  def apply(newValue: java.lang.String, oldValue: java.lang.String = null): Anon_NewValueOldValueString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueString]
  }
}

