package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupReplicationConfiguration extends js.Object {
  /**
    * Identifier of the server group this replication configuration is associated with.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
  /**
    * Replication configuration for servers in the server group.
    */
  var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.undefined
}

object ServerGroupReplicationConfiguration {
  @scala.inline
  def apply(
    serverGroupId: ServerGroupId = null,
    serverReplicationConfigurations: ServerReplicationConfigurations = null
  ): ServerGroupReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (serverGroupId != null) __obj.updateDynamic("serverGroupId")(serverGroupId)
    if (serverReplicationConfigurations != null) __obj.updateDynamic("serverReplicationConfigurations")(serverReplicationConfigurations)
    __obj.asInstanceOf[ServerGroupReplicationConfiguration]
  }
}

