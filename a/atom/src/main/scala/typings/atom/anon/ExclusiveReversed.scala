package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExclusiveReversed extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object ExclusiveReversed {
  @scala.inline
  def apply(exclusive: js.UndefOr[Boolean] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined): ExclusiveReversed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusiveReversed]
  }
}

