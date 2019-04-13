package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceConnectionStatus extends js.Object {
  /**
    * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
    */
  var ConnectionState: js.UndefOr[ConnectionState] = js.undefined
  /**
    * The timestamp of the connection status check.
    */
  var ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The timestamp of the last known user connection.
    */
  var LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
}

object WorkspaceConnectionStatus {
  @scala.inline
  def apply(
    ConnectionState: ConnectionState = null,
    ConnectionStateCheckTimestamp: Timestamp = null,
    LastKnownUserConnectionTimestamp: Timestamp = null,
    WorkspaceId: WorkspaceId = null
  ): WorkspaceConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (ConnectionStateCheckTimestamp != null) __obj.updateDynamic("ConnectionStateCheckTimestamp")(ConnectionStateCheckTimestamp)
    if (LastKnownUserConnectionTimestamp != null) __obj.updateDynamic("LastKnownUserConnectionTimestamp")(LastKnownUserConnectionTimestamp)
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId)
    __obj.asInstanceOf[WorkspaceConnectionStatus]
  }
}

