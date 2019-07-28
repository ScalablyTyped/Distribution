package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBClusterFromS3Result extends js.Object {
  var DBCluster: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBCluster] = js.undefined
}

object RestoreDBClusterFromS3Result {
  @scala.inline
  def apply(DBCluster: DBCluster = null): RestoreDBClusterFromS3Result = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[RestoreDBClusterFromS3Result]
  }
}

