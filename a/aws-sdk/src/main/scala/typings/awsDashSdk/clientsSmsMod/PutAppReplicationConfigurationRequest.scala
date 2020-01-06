package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application tassociated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Replication configurations for server groups in the application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.native
}

object PutAppReplicationConfigurationRequest {
  @scala.inline
  def apply(
    appId: AppId = null,
    serverGroupReplicationConfigurations: ServerGroupReplicationConfigurations = null
  ): PutAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (serverGroupReplicationConfigurations != null) __obj.updateDynamic("serverGroupReplicationConfigurations")(serverGroupReplicationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
  }
}

