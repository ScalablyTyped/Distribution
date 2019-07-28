package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBCluster] = js.undefined
}

object StopDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): StopDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[StopDBClusterResult]
  }
}

