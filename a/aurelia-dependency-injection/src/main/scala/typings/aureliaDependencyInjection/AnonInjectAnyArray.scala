package typings.aureliaDependencyInjection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInjectAnyArray extends js.Object {
  var inject: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
}

object AnonInjectAnyArray {
  @scala.inline
  def apply(inject: js.Array[_] | js.Function0[js.Array[_]] = null): AnonInjectAnyArray = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInjectAnyArray]
  }
}

