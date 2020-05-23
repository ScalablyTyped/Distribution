package typings.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitModelToViewChange extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  var emitModelToViewChange: js.UndefOr[Boolean] = js.undefined
  var emitViewToModelChange: js.UndefOr[Boolean] = js.undefined
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object EmitModelToViewChange {
  @scala.inline
  def apply(
    emitEvent: js.UndefOr[Boolean] = js.undefined,
    emitModelToViewChange: js.UndefOr[Boolean] = js.undefined,
    emitViewToModelChange: js.UndefOr[Boolean] = js.undefined,
    onlySelf: js.UndefOr[Boolean] = js.undefined
  ): EmitModelToViewChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitModelToViewChange)) __obj.updateDynamic("emitModelToViewChange")(emitModelToViewChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitViewToModelChange)) __obj.updateDynamic("emitViewToModelChange")(emitViewToModelChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitModelToViewChange]
  }
}

