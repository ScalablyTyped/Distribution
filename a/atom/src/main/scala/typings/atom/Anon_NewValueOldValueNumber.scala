package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueNumber extends js.Object {
  var newValue: Double
  var oldValue: js.UndefOr[Double] = js.undefined
}

object Anon_NewValueOldValueNumber {
  @scala.inline
  def apply(newValue: Double, oldValue: Int | Double = null): Anon_NewValueOldValueNumber = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewValueOldValueNumber]
  }
}

