package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueNumberString extends js.Object {
  var newValue: String | Double
  var oldValue: js.UndefOr[String | Double] = js.undefined
}

object Anon_NewValueOldValueNumberString {
  @scala.inline
  def apply(newValue: String | Double, oldValue: String | Double = null): Anon_NewValueOldValueNumberString = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewValueOldValueNumberString]
  }
}

