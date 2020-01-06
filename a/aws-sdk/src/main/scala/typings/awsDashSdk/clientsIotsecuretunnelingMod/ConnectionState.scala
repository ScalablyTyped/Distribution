package typings.awsDashSdk.clientsIotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionState extends js.Object {
  /**
    * The last time the connection status was updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.native
  /**
    * The connection status of the tunnel. Valid values are CONNECTED and DISCONNECTED.
    */
  var status: js.UndefOr[ConnectionStatus] = js.native
}

object ConnectionState {
  @scala.inline
  def apply(lastUpdatedAt: DateType = null, status: ConnectionStatus = null): ConnectionState = {
    val __obj = js.Dynamic.literal()
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
}

