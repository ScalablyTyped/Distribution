package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limited extends js.Object {
  var newValue: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided
  var oldValue: js.UndefOr[
    atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided
  ] = js.undefined
}

object Anon_Limited {
  @scala.inline
  def apply(
    newValue: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided,
    oldValue: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided = null
  ): Anon_Limited = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Limited]
  }
}

