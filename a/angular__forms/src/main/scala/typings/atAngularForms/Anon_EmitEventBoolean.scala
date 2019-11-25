package typings.atAngularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmitEventBoolean extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.undefined
}

object Anon_EmitEventBoolean {
  @scala.inline
  def apply(emitEvent: js.UndefOr[Boolean] = js.undefined): Anon_EmitEventBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmitEventBoolean]
  }
}

