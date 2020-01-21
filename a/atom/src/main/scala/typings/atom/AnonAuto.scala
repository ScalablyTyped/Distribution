package typings.atom

import typings.atom.atomStrings.auto
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuto extends js.Object {
  var newValue: auto | soft | hard
  var oldValue: js.UndefOr[auto | soft | hard] = js.undefined
}

object AnonAuto {
  @scala.inline
  def apply(newValue: auto | soft | hard, oldValue: auto | soft | hard = null): AnonAuto = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuto]
  }
}

