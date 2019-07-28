package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReplicationTaskAssessmentResultsMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * - The Amazon Resource Name (ARN) string that uniquely identifies the task. When this input parameter is specified the API will return only one result and ignore the values of the max-records and marker parameters. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
}

object DescribeReplicationTaskAssessmentResultsMessage {
  @scala.inline
  def apply(
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ReplicationTaskArn: String = null
  ): DescribeReplicationTaskAssessmentResultsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn)
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsMessage]
  }
}

