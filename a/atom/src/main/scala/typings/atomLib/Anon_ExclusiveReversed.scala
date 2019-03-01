package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveReversed extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ExclusiveReversed {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    reversed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ExclusiveReversed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_ExclusiveReversed]
  }
}

