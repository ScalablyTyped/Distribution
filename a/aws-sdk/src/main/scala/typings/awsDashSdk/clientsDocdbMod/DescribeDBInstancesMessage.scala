package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBInstancesMessage extends js.Object {
  /**
    * The user-provided instance identifier. If this parameter is specified, information from only the specific DB instance is returned. This parameter isn't case sensitive. Constraints:   If provided, must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A filter that specifies one or more DB instances to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list includes only the information about the DB instances that are associated with the DB clusters that are identified by these ARNs.    db-instance-id - Accepts DB instance identifiers and DB instance ARNs. The results list includes only the information about the DB instances that are identified by these ARNs.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeDBInstancesMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | Double = null
  ): DescribeDBInstancesMessage = {
    val __obj = js.Dynamic.literal()
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBInstancesMessage]
  }
}

