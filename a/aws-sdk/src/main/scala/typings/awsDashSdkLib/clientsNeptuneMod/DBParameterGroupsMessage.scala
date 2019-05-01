package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBParameterGroupsMessage extends js.Object {
  /**
    * A list of DBParameterGroup instances.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBParameterGroupsMessage {
  @scala.inline
  def apply(DBParameterGroups: DBParameterGroupList = null, Marker: String = null): DBParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroups != null) __obj.updateDynamic("DBParameterGroups")(DBParameterGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBParameterGroupsMessage]
  }
}

