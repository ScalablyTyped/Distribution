package typings.atom

import typings.atom.mod.Invisibles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueOldValueInvisibles extends js.Object {
  var newValue: Invisibles
  var oldValue: js.UndefOr[Invisibles] = js.undefined
}

object AnonNewValueOldValueInvisibles {
  @scala.inline
  def apply(newValue: Invisibles, oldValue: Invisibles = null): AnonNewValueOldValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueOldValueInvisibles]
  }
}

