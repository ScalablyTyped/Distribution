package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReplicationTasksMessage extends js.Object {
  /**
    * Filters applied to the describe action. Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn | replication-instance-arn
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Set this flag to avoid returning setting information. Use this to reduce overhead when settings are too large. Choose TRUE to use this flag, otherwise choose FALSE (default).
    */
  var WithoutSettings: js.UndefOr[BooleanOptional] = js.undefined
}

object DescribeReplicationTasksMessage {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    WithoutSettings: js.UndefOr[BooleanOptional] = js.undefined
  ): DescribeReplicationTasksMessage = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (!js.isUndefined(WithoutSettings)) __obj.updateDynamic("WithoutSettings")(WithoutSettings)
    __obj.asInstanceOf[DescribeReplicationTasksMessage]
  }
}

