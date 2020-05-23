package typings.aureliaDependencyInjection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectAny extends js.Object {
  var inject: js.UndefOr[js.Any] = js.undefined
}

object InjectAny {
  @scala.inline
  def apply(inject: js.Any = null): InjectAny = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectAny]
  }
}

