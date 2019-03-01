package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmitEventBoolean extends js.Object {
  var emitEvent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EmitEventBoolean {
  @scala.inline
  def apply(emitEvent: js.UndefOr[scala.Boolean] = js.undefined): Anon_EmitEventBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitEvent)) __obj.updateDynamic("emitEvent")(emitEvent)
    __obj.asInstanceOf[Anon_EmitEventBoolean]
  }
}

