package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Surface extends js.Object {
  /**
    * A list of capabilities the surface supports at the time of the request
    * e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var capabilities: js.UndefOr[js.Array[GoogleActionsV2Capability]] = js.undefined
}

object GoogleActionsV2Surface {
  @scala.inline
  def apply(capabilities: js.Array[GoogleActionsV2Capability] = null): GoogleActionsV2Surface = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    __obj.asInstanceOf[GoogleActionsV2Surface]
  }
}

