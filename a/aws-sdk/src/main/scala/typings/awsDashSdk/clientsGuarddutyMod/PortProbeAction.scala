package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortProbeAction extends js.Object {
  /**
    * Port probe blocked information.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of port probe details objects.
    */
  var PortProbeDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.PortProbeDetails] = js.undefined
}

object PortProbeAction {
  @scala.inline
  def apply(Blocked: js.UndefOr[scala.Boolean] = js.undefined, PortProbeDetails: PortProbeDetails = null): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Blocked)) __obj.updateDynamic("Blocked")(Blocked)
    if (PortProbeDetails != null) __obj.updateDynamic("PortProbeDetails")(PortProbeDetails)
    __obj.asInstanceOf[PortProbeAction]
  }
}

