package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailoverDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.DBCluster] = js.undefined
}

object FailoverDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): FailoverDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[FailoverDBClusterResult]
  }
}

