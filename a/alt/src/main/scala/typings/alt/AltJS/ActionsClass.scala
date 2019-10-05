package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsClass extends js.Object {
  var actions: js.UndefOr[Actions] = js.undefined
  var generateActions: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.undefined
  def dispatch(payload: js.Any*): Unit
}

object ActionsClass {
  @scala.inline
  def apply(
    dispatch: /* repeated */ js.Any => Unit,
    actions: Actions = null,
    generateActions: /* repeated */ String => Unit = null
  ): ActionsClass = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (generateActions != null) __obj.updateDynamic("generateActions")(js.Any.fromFunction1(generateActions))
    __obj.asInstanceOf[ActionsClass]
  }
}

