package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[typings.awsDashSdk.clientsRdsMod.GlobalCluster] = js.undefined
}

object CreateGlobalClusterResult {
  @scala.inline
  def apply(GlobalCluster: GlobalCluster = null): CreateGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalCluster != null) __obj.updateDynamic("GlobalCluster")(GlobalCluster)
    __obj.asInstanceOf[CreateGlobalClusterResult]
  }
}

