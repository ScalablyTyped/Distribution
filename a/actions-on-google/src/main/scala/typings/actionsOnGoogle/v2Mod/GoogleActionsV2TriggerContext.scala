package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2TriggerContext extends js.Object {
  /**
    * The time context for which the update can be triggered.
    */
  var timeContext: js.UndefOr[GoogleActionsV2TriggerContextTimeContext] = js.undefined
}

object GoogleActionsV2TriggerContext {
  @scala.inline
  def apply(timeContext: GoogleActionsV2TriggerContextTimeContext = null): GoogleActionsV2TriggerContext = {
    val __obj = js.Dynamic.literal()
    if (timeContext != null) __obj.updateDynamic("timeContext")(timeContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2TriggerContext]
  }
}

