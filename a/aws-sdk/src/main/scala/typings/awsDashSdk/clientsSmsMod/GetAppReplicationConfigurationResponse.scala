package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppReplicationConfigurationResponse extends js.Object {
  /**
    * Replication configurations associated with server groups in this application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
}

object GetAppReplicationConfigurationResponse {
  @scala.inline
  def apply(serverGroupReplicationConfigurations: ServerGroupReplicationConfigurations = null): GetAppReplicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (serverGroupReplicationConfigurations != null) __obj.updateDynamic("serverGroupReplicationConfigurations")(serverGroupReplicationConfigurations)
    __obj.asInstanceOf[GetAppReplicationConfigurationResponse]
  }
}

