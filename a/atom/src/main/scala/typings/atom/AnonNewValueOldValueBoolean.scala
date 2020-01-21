package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueOldValueBoolean extends js.Object {
  var newValue: Boolean
  var oldValue: js.UndefOr[Boolean] = js.undefined
}

object AnonNewValueOldValueBoolean {
  @scala.inline
  def apply(newValue: Boolean, oldValue: js.UndefOr[Boolean] = js.undefined): AnonNewValueOldValueBoolean = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueOldValueBoolean]
  }
}

