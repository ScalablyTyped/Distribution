package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSetting extends js.Object {
  /**
    * The name of the cluster setting. The only supported value is containerInsights.
    */
  var name: js.UndefOr[ClusterSettingName] = js.undefined
  /**
    * The value to set for the cluster setting. The supported values are enabled and disabled. If enabled is specified, CloudWatch Container Insights will be enabled for the cluster, otherwise it will be disabled unless the containerInsights account setting is enabled. If a cluster value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ClusterSetting {
  @scala.inline
  def apply(name: ClusterSettingName = null, value: String = null): ClusterSetting = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClusterSetting]
  }
}

