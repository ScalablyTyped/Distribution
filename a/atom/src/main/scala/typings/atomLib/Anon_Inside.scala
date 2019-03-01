package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inside extends js.Object {
  var invalidate: js.UndefOr[
    atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch
  ] = js.undefined
  var maintainHistory: js.UndefOr[scala.Boolean] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Inside {
  @scala.inline
  def apply(
    invalidate: atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch = null,
    maintainHistory: js.UndefOr[scala.Boolean] = js.undefined,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Inside = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_Inside]
  }
}

