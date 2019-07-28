package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterEndpointMessage extends js.Object {
  /**
    * Contains the details of the endpoints associated with the cluster and matching any filter conditions.
    */
  var DBClusterEndpoints: js.UndefOr[DBClusterEndpointList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpoints: DBClusterEndpointList = null, Marker: String = null): DBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterEndpoints != null) __obj.updateDynamic("DBClusterEndpoints")(DBClusterEndpoints)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBClusterEndpointMessage]
  }
}

