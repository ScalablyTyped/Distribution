package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDBClusterParameterGroupResult extends js.Object {
  var DBClusterParameterGroup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBClusterParameterGroup] = js.undefined
}

object CopyDBClusterParameterGroupResult {
  @scala.inline
  def apply(DBClusterParameterGroup: DBClusterParameterGroup = null): CopyDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup)
    __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
  }
}

