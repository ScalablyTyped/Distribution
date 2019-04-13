package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[GlobalCluster] = js.undefined
}

object DeleteGlobalClusterResult {
  @scala.inline
  def apply(GlobalCluster: GlobalCluster = null): DeleteGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalCluster != null) __obj.updateDynamic("GlobalCluster")(GlobalCluster)
    __obj.asInstanceOf[DeleteGlobalClusterResult]
  }
}

