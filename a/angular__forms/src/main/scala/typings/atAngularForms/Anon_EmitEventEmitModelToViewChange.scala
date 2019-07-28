package typings.atAngularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmitEventEmitModelToViewChange extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  var emitModelToViewChange: js.UndefOr[Boolean] = js.undefined
  var emitViewToModelChange: js.UndefOr[Boolean] = js.undefined
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object Anon_EmitEventEmitModelToViewChange {
  @scala.inline
  def apply(
    emitEvent: js.UndefOr[Boolean] = js.undefined,
    emitModelToViewChange: js.UndefOr[Boolean] = js.undefined,
    emitViewToModelChange: js.UndefOr[Boolean] = js.undefined,
    onlySelf: js.UndefOr[Boolean] = js.undefined
  ): Anon_EmitEventEmitModelToViewChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent)
    if (!js.isUndefined(emitModelToViewChange)) __obj.updateDynamic("emitModelToViewChange")(emitModelToViewChange)
    if (!js.isUndefined(emitViewToModelChange)) __obj.updateDynamic("emitViewToModelChange")(emitViewToModelChange)
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf)
    __obj.asInstanceOf[Anon_EmitEventEmitModelToViewChange]
  }
}

