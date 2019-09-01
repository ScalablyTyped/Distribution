package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterSettingsRequest extends js.Object {
  /**
    * The name of the cluster to modify the settings for.
    */
  var cluster: String
  /**
    * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a cluster. If this value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var settings: ClusterSettings
}

object UpdateClusterSettingsRequest {
  @scala.inline
  def apply(cluster: String, settings: ClusterSettings): UpdateClusterSettingsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster, settings = settings)
  
    __obj.asInstanceOf[UpdateClusterSettingsRequest]
  }
}

