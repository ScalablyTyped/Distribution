package typings.aureliaDashDependencyDashInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InjectAny extends js.Object {
  var inject: js.UndefOr[js.Any] = js.undefined
}

object Anon_InjectAny {
  @scala.inline
  def apply(inject: js.Any = null): Anon_InjectAny = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InjectAny]
  }
}

