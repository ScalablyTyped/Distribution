package typings.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmitEventBoolean extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
}

object AnonEmitEventBoolean {
  @scala.inline
  def apply(emitEvent: js.UndefOr[Boolean] = js.undefined): AnonEmitEventBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmitEventBoolean]
  }
}

