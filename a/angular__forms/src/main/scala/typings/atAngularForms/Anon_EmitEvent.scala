package typings.atAngularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmitEvent extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object Anon_EmitEvent {
  @scala.inline
  def apply(emitEvent: js.UndefOr[Boolean] = js.undefined, onlySelf: js.UndefOr[Boolean] = js.undefined): Anon_EmitEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmitEvent]
  }
}

