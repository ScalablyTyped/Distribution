package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueNull extends js.Object {
  var newValue: String | Null
  var oldValue: js.UndefOr[String | Null] = js.undefined
}

object Anon_NewValueOldValueNull {
  @scala.inline
  def apply(newValue: String = null, oldValue: String = null): Anon_NewValueOldValueNull = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewValueOldValueNull]
  }
}

