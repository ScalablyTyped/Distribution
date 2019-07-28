package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueBoolean extends js.Object {
  var newValue: Boolean
  var oldValue: js.UndefOr[Boolean] = js.undefined
}

object Anon_NewValueOldValueBoolean {
  @scala.inline
  def apply(newValue: Boolean, oldValue: js.UndefOr[Boolean] = js.undefined): Anon_NewValueOldValueBoolean = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueBoolean]
  }
}

