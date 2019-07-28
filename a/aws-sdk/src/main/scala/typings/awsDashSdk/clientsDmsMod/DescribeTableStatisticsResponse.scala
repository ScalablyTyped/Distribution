package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTableStatisticsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  /**
    * The table statistics.
    */
  var TableStatistics: js.UndefOr[TableStatisticsList] = js.undefined
}

object DescribeTableStatisticsResponse {
  @scala.inline
  def apply(
    Marker: String = null,
    ReplicationTaskArn: String = null,
    TableStatistics: TableStatisticsList = null
  ): DescribeTableStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn)
    if (TableStatistics != null) __obj.updateDynamic("TableStatistics")(TableStatistics)
    __obj.asInstanceOf[DescribeTableStatisticsResponse]
  }
}

