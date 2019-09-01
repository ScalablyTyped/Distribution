package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterSettingsResponse extends js.Object {
  var cluster: js.UndefOr[Cluster] = js.undefined
}

object UpdateClusterSettingsResponse {
  @scala.inline
  def apply(cluster: Cluster = null): UpdateClusterSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[UpdateClusterSettingsResponse]
  }
}

