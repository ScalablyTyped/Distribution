package typings.aureliaDashDependencyDashInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InjectAnyArray extends js.Object {
  var inject: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
}

object Anon_InjectAnyArray {
  @scala.inline
  def apply(inject: js.Array[_] | js.Function0[js.Array[_]] = null): Anon_InjectAnyArray = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InjectAnyArray]
  }
}

