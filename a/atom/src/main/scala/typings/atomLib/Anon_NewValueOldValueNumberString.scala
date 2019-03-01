package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueNumberString extends js.Object {
  var newValue: java.lang.String | scala.Double
  var oldValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_NewValueOldValueNumberString {
  @scala.inline
  def apply(newValue: java.lang.String | scala.Double, oldValue: java.lang.String | scala.Double = null): Anon_NewValueOldValueNumberString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewValueOldValueNumberString]
  }
}

