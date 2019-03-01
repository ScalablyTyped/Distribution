package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirectionClosestForward extends js.Object {
  var clipDirection: js.UndefOr[
    atomLib.atomLibStrings.backward | atomLib.atomLibStrings.forward | atomLib.atomLibStrings.closest
  ] = js.undefined
}

object Anon_BackwardClipDirectionClosestForward {
  @scala.inline
  def apply(
    clipDirection: atomLib.atomLibStrings.backward | atomLib.atomLibStrings.forward | atomLib.atomLibStrings.closest = null
  ): Anon_BackwardClipDirectionClosestForward = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackwardClipDirectionClosestForward]
  }
}

