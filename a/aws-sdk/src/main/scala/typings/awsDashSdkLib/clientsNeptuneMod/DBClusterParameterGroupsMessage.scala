package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterParameterGroupsMessage extends js.Object {
  /**
    * A list of DB cluster parameter groups.
    */
  var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBClusterParameterGroupsMessage {
  @scala.inline
  def apply(DBClusterParameterGroups: DBClusterParameterGroupList = null, Marker: String = null): DBClusterParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroups != null) __obj.updateDynamic("DBClusterParameterGroups")(DBClusterParameterGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBClusterParameterGroupsMessage]
  }
}

