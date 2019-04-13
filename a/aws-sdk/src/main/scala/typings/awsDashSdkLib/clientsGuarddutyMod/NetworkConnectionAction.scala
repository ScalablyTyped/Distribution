package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConnectionAction extends js.Object {
  /**
    * Network connection blocked information.
    */
  var Blocked: js.UndefOr[__boolean] = js.undefined
  /**
    * Network connection direction.
    */
  var ConnectionDirection: js.UndefOr[__string] = js.undefined
  /**
    * Local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined
  /**
    * Network connection protocol.
    */
  var Protocol: js.UndefOr[__string] = js.undefined
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
  /**
    * Remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[RemotePortDetails] = js.undefined
}

object NetworkConnectionAction {
  @scala.inline
  def apply(
    Blocked: js.UndefOr[__boolean] = js.undefined,
    ConnectionDirection: __string = null,
    LocalPortDetails: LocalPortDetails = null,
    Protocol: __string = null,
    RemoteIpDetails: RemoteIpDetails = null,
    RemotePortDetails: RemotePortDetails = null
  ): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Blocked)) __obj.updateDynamic("Blocked")(Blocked)
    if (ConnectionDirection != null) __obj.updateDynamic("ConnectionDirection")(ConnectionDirection)
    if (LocalPortDetails != null) __obj.updateDynamic("LocalPortDetails")(LocalPortDetails)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol)
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails)
    if (RemotePortDetails != null) __obj.updateDynamic("RemotePortDetails")(RemotePortDetails)
    __obj.asInstanceOf[NetworkConnectionAction]
  }
}

