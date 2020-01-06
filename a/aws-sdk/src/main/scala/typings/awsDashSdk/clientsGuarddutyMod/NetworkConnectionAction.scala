package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConnectionAction extends js.Object {
  /**
    * Network connection blocked information.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  /**
    * Network connection direction.
    */
  var ConnectionDirection: js.UndefOr[String] = js.native
  /**
    * Local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.LocalPortDetails] = js.native
  /**
    * Network connection protocol.
    */
  var Protocol: js.UndefOr[String] = js.native
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.RemoteIpDetails] = js.native
  /**
    * Remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.RemotePortDetails] = js.native
}

object NetworkConnectionAction {
  @scala.inline
  def apply(
    Blocked: js.UndefOr[scala.Boolean] = js.undefined,
    ConnectionDirection: String = null,
    LocalPortDetails: LocalPortDetails = null,
    Protocol: String = null,
    RemoteIpDetails: RemoteIpDetails = null,
    RemotePortDetails: RemotePortDetails = null
  ): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Blocked)) __obj.updateDynamic("Blocked")(Blocked.asInstanceOf[js.Any])
    if (ConnectionDirection != null) __obj.updateDynamic("ConnectionDirection")(ConnectionDirection.asInstanceOf[js.Any])
    if (LocalPortDetails != null) __obj.updateDynamic("LocalPortDetails")(LocalPortDetails.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails.asInstanceOf[js.Any])
    if (RemotePortDetails != null) __obj.updateDynamic("RemotePortDetails")(RemotePortDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConnectionAction]
  }
}

