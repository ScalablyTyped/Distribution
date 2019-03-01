package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmitEventEmitModelToViewChange extends js.Object {
  var emitEvent: js.UndefOr[scala.Boolean] = js.undefined
  var emitModelToViewChange: js.UndefOr[scala.Boolean] = js.undefined
  var emitViewToModelChange: js.UndefOr[scala.Boolean] = js.undefined
  var onlySelf: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EmitEventEmitModelToViewChange {
  @scala.inline
  def apply(
    emitEvent: js.UndefOr[scala.Boolean] = js.undefined,
    emitModelToViewChange: js.UndefOr[scala.Boolean] = js.undefined,
    emitViewToModelChange: js.UndefOr[scala.Boolean] = js.undefined,
    onlySelf: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EmitEventEmitModelToViewChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent)
    if (!js.isUndefined(emitModelToViewChange)) __obj.updateDynamic("emitModelToViewChange")(emitModelToViewChange)
    if (!js.isUndefined(emitViewToModelChange)) __obj.updateDynamic("emitViewToModelChange")(emitViewToModelChange)
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf)
    __obj.asInstanceOf[Anon_EmitEventEmitModelToViewChange]
  }
}

