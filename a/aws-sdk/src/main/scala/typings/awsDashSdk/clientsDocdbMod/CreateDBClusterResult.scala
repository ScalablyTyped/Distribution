package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.DBCluster] = js.undefined
}

object CreateDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): CreateDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[CreateDBClusterResult]
  }
}

