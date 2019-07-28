package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTableStatisticsMessage extends js.Object {
  /**
    * Filters applied to the describe table statistics action. Valid filter names: schema-name | table-name | table-state A combination of filters creates an AND condition where each record matches all specified filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 500.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: String
}

object DescribeTableStatisticsMessage {
  @scala.inline
  def apply(
    ReplicationTaskArn: String,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeTableStatisticsMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeTableStatisticsMessage]
  }
}

