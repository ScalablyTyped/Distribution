package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReversedBoolean extends js.Object {
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object AnonReversedBoolean {
  @scala.inline
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): AnonReversedBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReversedBoolean]
  }
}

