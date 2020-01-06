package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterToPointInTimeResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.DBCluster] = js.native
}

object RestoreDBClusterToPointInTimeResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): RestoreDBClusterToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeResult]
  }
}

