package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReversedBoolean extends js.Object {
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object ReversedBoolean {
  @scala.inline
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): ReversedBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReversedBoolean]
  }
}

