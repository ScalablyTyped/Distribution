package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterSettingsResponse extends js.Object {
  var cluster: js.UndefOr[Cluster] = js.native
}

object UpdateClusterSettingsResponse {
  @scala.inline
  def apply(cluster: Cluster = null): UpdateClusterSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterSettingsResponse]
  }
}

