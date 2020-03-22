package typings.atom

import typings.atom.mod.Invisibles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueInvisibles extends js.Object {
  var newValue: Invisibles
  var oldValue: js.UndefOr[Invisibles] = js.undefined
}

object AnonNewValueInvisibles {
  @scala.inline
  def apply(newValue: Invisibles, oldValue: Invisibles = null): AnonNewValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueInvisibles]
  }
}

