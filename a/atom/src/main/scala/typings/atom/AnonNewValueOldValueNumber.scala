package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueOldValueNumber extends js.Object {
  var newValue: Double
  var oldValue: js.UndefOr[Double] = js.undefined
}

object AnonNewValueOldValueNumber {
  @scala.inline
  def apply(newValue: Double, oldValue: Int | Double = null): AnonNewValueOldValueNumber = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueOldValueNumber]
  }
}

