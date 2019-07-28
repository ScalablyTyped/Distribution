package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBClustersMessage extends js.Object {
  /**
    * The user-supplied DB cluster identifier. If this parameter is specified, information from only the specific DB cluster is returned. This parameter isn't case-sensitive. Constraints:   If supplied, must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A filter that specifies one or more DB clusters to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include information about the DB clusters identified by these ARNs.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * Optional Boolean parameter that specifies whether the output includes information about clusters shared from other AWS accounts.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional pagination token provided by a previous DescribeDBClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeDBClustersMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String = null,
    Filters: FilterList = null,
    IncludeShared: js.UndefOr[Boolean] = js.undefined,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeDBClustersMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(IncludeShared)) __obj.updateDynamic("IncludeShared")(IncludeShared)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeDBClustersMessage]
  }
}

