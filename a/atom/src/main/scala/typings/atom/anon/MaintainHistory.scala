package typings.atom.anon

import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintainHistory extends js.Object {
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object MaintainHistory {
  @scala.inline
  def apply(
    invalidate: never | surround | overlap | inside | touch = null,
    maintainHistory: js.UndefOr[Boolean] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): MaintainHistory = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintainHistory]
  }
}

