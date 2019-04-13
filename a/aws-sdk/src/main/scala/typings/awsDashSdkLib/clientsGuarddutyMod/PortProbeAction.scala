package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortProbeAction extends js.Object {
  /**
    * Port probe blocked information.
    */
  var Blocked: js.UndefOr[__boolean] = js.undefined
  /**
    * A list of port probe details objects.
    */
  var PortProbeDetails: js.UndefOr[__listOfPortProbeDetail] = js.undefined
}

object PortProbeAction {
  @scala.inline
  def apply(Blocked: js.UndefOr[__boolean] = js.undefined, PortProbeDetails: __listOfPortProbeDetail = null): PortProbeAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Blocked)) __obj.updateDynamic("Blocked")(Blocked)
    if (PortProbeDetails != null) __obj.updateDynamic("PortProbeDetails")(PortProbeDetails)
    __obj.asInstanceOf[PortProbeAction]
  }
}

