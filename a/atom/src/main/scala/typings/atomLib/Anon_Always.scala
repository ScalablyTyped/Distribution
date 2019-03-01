package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  var newValue: atomLib.atomLibStrings.no | atomLib.atomLibStrings.yes | atomLib.atomLibStrings.always
  var oldValue: js.UndefOr[
    atomLib.atomLibStrings.no | atomLib.atomLibStrings.yes | atomLib.atomLibStrings.always
  ] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(
    newValue: atomLib.atomLibStrings.no | atomLib.atomLibStrings.yes | atomLib.atomLibStrings.always,
    oldValue: atomLib.atomLibStrings.no | atomLib.atomLibStrings.yes | atomLib.atomLibStrings.always = null
  ): Anon_Always = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Always]
  }
}

