package typings.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInjectAny extends js.Object {
  var inject: js.UndefOr[js.Any] = js.undefined
}

object AnonInjectAny {
  @scala.inline
  def apply(inject: js.Any = null): AnonInjectAny = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInjectAny]
  }
}

