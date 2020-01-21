package typings.atom

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackwardClipDirectionClosestForward extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
}

object AnonBackwardClipDirectionClosestForward {
  @scala.inline
  def apply(clipDirection: backward | forward | closest = null): AnonBackwardClipDirectionClosestForward = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackwardClipDirectionClosestForward]
  }
}

