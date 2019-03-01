package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirectionClosestForwardInside extends js.Object {
  var clipDirection: js.UndefOr[
    atomLib.atomLibStrings.backward | atomLib.atomLibStrings.forward | atomLib.atomLibStrings.closest
  ] = js.undefined
  var invalidate: js.UndefOr[
    atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch
  ] = js.undefined
}

object Anon_BackwardClipDirectionClosestForwardInside {
  @scala.inline
  def apply(
    clipDirection: atomLib.atomLibStrings.backward | atomLib.atomLibStrings.forward | atomLib.atomLibStrings.closest = null,
    invalidate: atomLib.atomLibStrings.never | atomLib.atomLibStrings.surround | atomLib.atomLibStrings.overlap | atomLib.atomLibStrings.inside | atomLib.atomLibStrings.touch = null
  ): Anon_BackwardClipDirectionClosestForwardInside = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackwardClipDirectionClosestForwardInside]
  }
}

