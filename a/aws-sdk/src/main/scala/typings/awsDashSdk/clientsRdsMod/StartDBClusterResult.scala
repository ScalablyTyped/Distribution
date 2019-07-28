package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBCluster] = js.undefined
}

object StartDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): StartDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[StartDBClusterResult]
  }
}

