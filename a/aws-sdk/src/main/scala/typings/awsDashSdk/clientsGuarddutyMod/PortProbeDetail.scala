package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeDetail extends js.Object {
  /**
    * Local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.LocalPortDetails] = js.native
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.RemoteIpDetails] = js.native
}

object PortProbeDetail {
  @scala.inline
  def apply(LocalPortDetails: LocalPortDetails = null, RemoteIpDetails: RemoteIpDetails = null): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    if (LocalPortDetails != null) __obj.updateDynamic("LocalPortDetails")(LocalPortDetails.asInstanceOf[js.Any])
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortProbeDetail]
  }
}

