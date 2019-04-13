package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterParameterGroupResult extends js.Object {
  var DBClusterParameterGroup: js.UndefOr[DBClusterParameterGroup] = js.undefined
}

object CreateDBClusterParameterGroupResult {
  @scala.inline
  def apply(DBClusterParameterGroup: DBClusterParameterGroup = null): CreateDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup)
    __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
  }
}

