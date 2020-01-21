package typings.atom

import typings.atom.atomStrings.limited
import typings.atom.atomStrings.no
import typings.atom.atomStrings.undecided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimited extends js.Object {
  var newValue: limited | no | undecided
  var oldValue: js.UndefOr[limited | no | undecided] = js.undefined
}

object AnonLimited {
  @scala.inline
  def apply(newValue: limited | no | undecided, oldValue: limited | no | undecided = null): AnonLimited = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimited]
  }
}

