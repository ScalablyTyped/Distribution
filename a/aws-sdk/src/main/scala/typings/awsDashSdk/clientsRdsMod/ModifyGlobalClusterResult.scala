package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[typings.awsDashSdk.clientsRdsMod.GlobalCluster] = js.undefined
}

object ModifyGlobalClusterResult {
  @scala.inline
  def apply(GlobalCluster: GlobalCluster = null): ModifyGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalCluster != null) __obj.updateDynamic("GlobalCluster")(GlobalCluster)
    __obj.asInstanceOf[ModifyGlobalClusterResult]
  }
}

