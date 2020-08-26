package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Surface extends js.Object {
  /**
    * A list of capabilities the surface supports at the time of the request
    * e.g. `actions.capability.AUDIO_OUTPUT`
    */
  var capabilities: js.UndefOr[js.Array[GoogleActionsV2Capability]] = js.native
}

object GoogleActionsV2Surface {
  @scala.inline
  def apply(): GoogleActionsV2Surface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Surface]
  }
  @scala.inline
  implicit class GoogleActionsV2SurfaceOps[Self <: GoogleActionsV2Surface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilitiesVarargs(value: GoogleActionsV2Capability*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[GoogleActionsV2Capability]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
  }
  
}

