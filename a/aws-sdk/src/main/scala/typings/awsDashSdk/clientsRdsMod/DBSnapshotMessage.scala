package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBSnapshotMessage extends js.Object {
  /**
    *  A list of DBSnapshot instances. 
    */
  var DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBSnapshotMessage {
  @scala.inline
  def apply(DBSnapshots: DBSnapshotList = null, Marker: String = null): DBSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshots != null) __obj.updateDynamic("DBSnapshots")(DBSnapshots)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBSnapshotMessage]
  }
}

