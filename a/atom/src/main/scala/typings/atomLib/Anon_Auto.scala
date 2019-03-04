package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var newValue: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard
  var oldValue: js.UndefOr[
    atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard
  ] = js.undefined
}

object Anon_Auto {
  @scala.inline
  def apply(
    newValue: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard,
    oldValue: atomLib.atomLibStrings.auto | atomLib.atomLibStrings.soft | atomLib.atomLibStrings.hard = null
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

