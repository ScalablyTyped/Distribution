package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsClass extends js.Object {
  var actions: js.UndefOr[Actions] = js.undefined
  var generateActions: js.UndefOr[js.Function1[/* repeated */ java.lang.String, scala.Unit]] = js.undefined
  def dispatch(payload: js.Any*): scala.Unit
}

object ActionsClass {
  @scala.inline
  def apply(
    dispatch: js.Function1[/* repeated */ js.Any, scala.Unit],
    actions: Actions = null,
    generateActions: js.Function1[/* repeated */ java.lang.String, scala.Unit] = null
  ): ActionsClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (generateActions != null) __obj.updateDynamic("generateActions")(generateActions)
    __obj.asInstanceOf[ActionsClass]
  }
}

