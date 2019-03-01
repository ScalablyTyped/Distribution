package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueNull extends js.Object {
  var newValue: java.lang.String | scala.Null
  var oldValue: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_NewValueOldValueNull {
  @scala.inline
  def apply(newValue: java.lang.String = null, oldValue: java.lang.String = null): Anon_NewValueOldValueNull = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueNull]
  }
}

