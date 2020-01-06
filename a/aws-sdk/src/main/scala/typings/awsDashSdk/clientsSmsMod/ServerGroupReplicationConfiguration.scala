package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupReplicationConfiguration extends js.Object {
  /**
    * Identifier of the server group this replication configuration is associated with.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  /**
    * Replication configuration for servers in the server group.
    */
  var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.native
}

object ServerGroupReplicationConfiguration {
  @scala.inline
  def apply(
    serverGroupId: ServerGroupId = null,
    serverReplicationConfigurations: ServerReplicationConfigurations = null
  ): ServerGroupReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (serverGroupId != null) __obj.updateDynamic("serverGroupId")(serverGroupId.asInstanceOf[js.Any])
    if (serverReplicationConfigurations != null) __obj.updateDynamic("serverReplicationConfigurations")(serverReplicationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupReplicationConfiguration]
  }
}

