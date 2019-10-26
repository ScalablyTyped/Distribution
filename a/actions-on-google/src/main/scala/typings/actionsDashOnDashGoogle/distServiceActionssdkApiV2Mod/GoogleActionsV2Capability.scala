package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Capability extends js.Object {
  /**
    * The name of the capability, e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var name: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2Capability {
  @scala.inline
  def apply(name: String = null): GoogleActionsV2Capability = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GoogleActionsV2Capability]
  }
}

