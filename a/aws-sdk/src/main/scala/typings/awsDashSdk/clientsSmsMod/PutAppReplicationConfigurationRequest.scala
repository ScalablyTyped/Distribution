package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application tassociated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  /**
    * Replication configurations for server groups in the application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
}

object PutAppReplicationConfigurationRequest {
  @scala.inline
  def apply(
    appId: AppId = null,
    serverGroupReplicationConfigurations: ServerGroupReplicationConfigurations = null
  ): PutAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (serverGroupReplicationConfigurations != null) __obj.updateDynamic("serverGroupReplicationConfigurations")(serverGroupReplicationConfigurations)
    __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
  }
}

