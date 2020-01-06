package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerReplicationConfiguration extends js.Object {
  /**
    * Identifier of the server this replication configuration is associated with.
    */
  var server: js.UndefOr[Server] = js.native
  /**
    * Parameters for replicating the server.
    */
  var serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.native
}

object ServerReplicationConfiguration {
  @scala.inline
  def apply(server: Server = null, serverReplicationParameters: ServerReplicationParameters = null): ServerReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (serverReplicationParameters != null) __obj.updateDynamic("serverReplicationParameters")(serverReplicationParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerReplicationConfiguration]
  }
}

