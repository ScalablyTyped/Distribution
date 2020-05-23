package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueOldValue extends js.Object {
  var newValue: Boolean
  var oldValue: js.UndefOr[Boolean] = js.undefined
}

object NewValueOldValue {
  @scala.inline
  def apply(newValue: Boolean, oldValue: js.UndefOr[Boolean] = js.undefined): NewValueOldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueOldValue]
  }
}

