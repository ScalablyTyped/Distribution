package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmitEvent extends js.Object {
  var emitEvent: js.UndefOr[scala.Boolean] = js.undefined
  var onlySelf: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EmitEvent {
  @scala.inline
  def apply(
    emitEvent: js.UndefOr[scala.Boolean] = js.undefined,
    onlySelf: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EmitEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent)
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf)
    __obj.asInstanceOf[Anon_EmitEvent]
  }
}

