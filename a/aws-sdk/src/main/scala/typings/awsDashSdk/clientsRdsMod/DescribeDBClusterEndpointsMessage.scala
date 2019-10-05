package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBClusterEndpointsMessage extends js.Object {
  /**
    * The identifier of the endpoint to describe. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A set of name-value pairs that define which endpoints to include in the output. The filters are specified as name-value pairs, in the format Name=endpoint_type,Values=endpoint_type1,endpoint_type2,.... Name can be one of: db-cluster-endpoint-type, db-cluster-endpoint-custom-type, db-cluster-endpoint-id, db-cluster-endpoint-status. Values for the  db-cluster-endpoint-type filter can be one or more of: reader, writer, custom. Values for the db-cluster-endpoint-custom-type filter can be one or more of: reader, any. Values for the db-cluster-endpoint-status filter can be one or more of: available, creating, deleting, modifying. 
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterEndpoints request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeDBClusterEndpointsMessage {
  @scala.inline
  def apply(
    DBClusterEndpointIdentifier: String = null,
    DBClusterIdentifier: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeDBClusterEndpointsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterEndpointIdentifier != null) __obj.updateDynamic("DBClusterEndpointIdentifier")(DBClusterEndpointIdentifier)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBClusterEndpointsMessage]
  }
}

