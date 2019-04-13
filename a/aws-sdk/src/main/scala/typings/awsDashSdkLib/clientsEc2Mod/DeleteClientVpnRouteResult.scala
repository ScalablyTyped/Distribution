package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClientVpnRouteResult extends js.Object {
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.undefined
}

object DeleteClientVpnRouteResult {
  @scala.inline
  def apply(Status: ClientVpnRouteStatus = null): DeleteClientVpnRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DeleteClientVpnRouteResult]
  }
}

