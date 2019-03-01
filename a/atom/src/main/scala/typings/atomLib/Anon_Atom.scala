package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atom extends js.Object {
  var newValue: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom
  var oldValue: js.UndefOr[
    atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom
  ] = js.undefined
}

object Anon_Atom {
  @scala.inline
  def apply(
    newValue: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom,
    oldValue: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom = null
  ): Anon_Atom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Atom]
  }
}

