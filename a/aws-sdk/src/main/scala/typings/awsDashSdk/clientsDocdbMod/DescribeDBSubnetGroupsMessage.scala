package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBSubnetGroupsMessage extends js.Object {
  /**
    * The name of the DB subnet group to return details for.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * This parameter is not currently supported.
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

object DescribeDBSubnetGroupsMessage {
  @scala.inline
  def apply(
    DBSubnetGroupName: String = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | Double = null
  ): DescribeDBSubnetGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBSubnetGroupsMessage]
  }
}

