package typings.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmitEvent extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
  var onlySelf: js.UndefOr[Boolean] = js.undefined
}

object AnonEmitEvent {
  @scala.inline
  def apply(emitEvent: js.UndefOr[Boolean] = js.undefined, onlySelf: js.UndefOr[Boolean] = js.undefined): AnonEmitEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySelf)) __obj.updateDynamic("onlySelf")(onlySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmitEvent]
  }
}

