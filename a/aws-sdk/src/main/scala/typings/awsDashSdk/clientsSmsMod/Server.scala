package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  /**
    * Indicates whether the replication job is deleted or failed.
    */
  var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined
  /**
    * The identifier of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.undefined
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.undefined
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.undefined
}

object Server {
  @scala.inline
  def apply(
    replicationJobId: ReplicationJobId = null,
    replicationJobTerminated: js.UndefOr[Boolean] = js.undefined,
    serverId: ServerId = null,
    serverType: ServerType = null,
    vmServer: VmServer = null
  ): Server = {
    val __obj = js.Dynamic.literal()
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId)
    if (!js.isUndefined(replicationJobTerminated)) __obj.updateDynamic("replicationJobTerminated")(replicationJobTerminated)
    if (serverId != null) __obj.updateDynamic("serverId")(serverId)
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (vmServer != null) __obj.updateDynamic("vmServer")(vmServer)
    __obj.asInstanceOf[Server]
  }
}

