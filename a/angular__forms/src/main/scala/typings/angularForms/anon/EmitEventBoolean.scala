package typings.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitEventBoolean extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
}

object EmitEventBoolean {
  @scala.inline
  def apply(emitEvent: js.UndefOr[Boolean] = js.undefined): EmitEventBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitEventBoolean]
  }
}

