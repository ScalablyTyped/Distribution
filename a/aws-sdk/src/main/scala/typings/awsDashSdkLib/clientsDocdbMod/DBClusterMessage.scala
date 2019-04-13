package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterMessage extends js.Object {
  /**
    * A list of DB clusters.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBClusterMessage {
  @scala.inline
  def apply(DBClusters: DBClusterList = null, Marker: String = null): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusters != null) __obj.updateDynamic("DBClusters")(DBClusters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBClusterMessage]
  }
}

