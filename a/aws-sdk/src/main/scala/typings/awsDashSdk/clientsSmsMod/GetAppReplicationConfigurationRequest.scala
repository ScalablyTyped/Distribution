package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application associated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}

object GetAppReplicationConfigurationRequest {
  @scala.inline
  def apply(appId: AppId = null): GetAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[GetAppReplicationConfigurationRequest]
  }
}

