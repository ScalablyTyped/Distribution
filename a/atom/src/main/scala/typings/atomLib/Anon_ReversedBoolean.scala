package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReversedBoolean extends js.Object {
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ReversedBoolean {
  @scala.inline
  def apply(reversed: js.UndefOr[scala.Boolean] = js.undefined): Anon_ReversedBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[Anon_ReversedBoolean]
  }
}

