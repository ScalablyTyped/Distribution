package typings.atom

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackwardClipDirectionClosestForwardInside extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object AnonBackwardClipDirectionClosestForwardInside {
  @scala.inline
  def apply(
    clipDirection: backward | forward | closest = null,
    invalidate: never | surround | overlap | inside | touch = null
  ): AnonBackwardClipDirectionClosestForwardInside = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackwardClipDirectionClosestForwardInside]
  }
}

