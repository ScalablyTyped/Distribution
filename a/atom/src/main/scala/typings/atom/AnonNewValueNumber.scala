package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueNumber extends js.Object {
  var newValue: Double
  var oldValue: js.UndefOr[Double] = js.undefined
}

object AnonNewValueNumber {
  @scala.inline
  def apply(newValue: Double, oldValue: Int | Double = null): AnonNewValueNumber = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueNumber]
  }
}

