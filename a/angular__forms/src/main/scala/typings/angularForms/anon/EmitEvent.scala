package typings.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitEvent extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object EmitEvent {
  @scala.inline
  def apply(emitEvent: js.UndefOr[Boolean] = js.undefined, onlySelf: js.UndefOr[Boolean] = js.undefined): EmitEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitEvent]
  }
}

