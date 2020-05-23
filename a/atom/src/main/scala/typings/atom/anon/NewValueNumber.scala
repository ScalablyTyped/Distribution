package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueNumber extends js.Object {
  var newValue: Double
  var oldValue: js.UndefOr[Double] = js.undefined
}

object NewValueNumber {
  @scala.inline
  def apply(newValue: Double, oldValue: js.UndefOr[Double] = js.undefined): NewValueNumber = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueNumber]
  }
}

