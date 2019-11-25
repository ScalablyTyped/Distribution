package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2TriggerContextTimeContext extends js.Object {
  /**
    * The high-level frequency of the recurring update.
    */
  var frequency: js.UndefOr[GoogleActionsV2TriggerContextTimeContextFrequency] = js.undefined
}

object GoogleActionsV2TriggerContextTimeContext {
  @scala.inline
  def apply(frequency: GoogleActionsV2TriggerContextTimeContextFrequency = null): GoogleActionsV2TriggerContextTimeContext = {
    val __obj = js.Dynamic.literal()
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2TriggerContextTimeContext]
  }
}

