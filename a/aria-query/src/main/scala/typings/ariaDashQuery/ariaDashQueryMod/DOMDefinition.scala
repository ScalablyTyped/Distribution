package typings.ariaDashQuery.ariaDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMDefinition extends js.Object {
  var interactive: js.UndefOr[Boolean] = js.undefined
  var reserved: js.UndefOr[Boolean] = js.undefined
}

object DOMDefinition {
  @scala.inline
  def apply(interactive: js.UndefOr[Boolean] = js.undefined, reserved: js.UndefOr[Boolean] = js.undefined): DOMDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(reserved)) __obj.updateDynamic("reserved")(reserved)
    __obj.asInstanceOf[DOMDefinition]
  }
}

