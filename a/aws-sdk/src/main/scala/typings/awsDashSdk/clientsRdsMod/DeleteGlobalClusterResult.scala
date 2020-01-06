package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[typings.awsDashSdk.clientsRdsMod.GlobalCluster] = js.native
}

object DeleteGlobalClusterResult {
  @scala.inline
  def apply(GlobalCluster: GlobalCluster = null): DeleteGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalCluster != null) __obj.updateDynamic("GlobalCluster")(GlobalCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalClusterResult]
  }
}

