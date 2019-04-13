package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterSnapshotMessage extends js.Object {
  /**
    * Provides a list of DB cluster snapshots.
    */
  var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterSnapshots: DBClusterSnapshotList = null, Marker: String = null): DBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshots != null) __obj.updateDynamic("DBClusterSnapshots")(DBClusterSnapshots)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBClusterSnapshotMessage]
  }
}

