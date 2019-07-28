package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUpdateActionsMessage extends js.Object {
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.undefined
  /**
    * The range of time specified to search for service updates that are in available status
    */
  var ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter] = js.undefined
  /**
    * Dictates whether to include node level update status in the response 
    */
  var ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The status of the update action.
    */
  var UpdateActionStatus: js.UndefOr[UpdateActionStatusList] = js.undefined
}

object DescribeUpdateActionsMessage {
  @scala.inline
  def apply(
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ReplicationGroupIds: ReplicationGroupIdList = null,
    ServiceUpdateName: String = null,
    ServiceUpdateStatus: ServiceUpdateStatusList = null,
    ServiceUpdateTimeRange: TimeRangeFilter = null,
    ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.undefined,
    UpdateActionStatus: UpdateActionStatusList = null
  ): DescribeUpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (ReplicationGroupIds != null) __obj.updateDynamic("ReplicationGroupIds")(ReplicationGroupIds)
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName)
    if (ServiceUpdateStatus != null) __obj.updateDynamic("ServiceUpdateStatus")(ServiceUpdateStatus)
    if (ServiceUpdateTimeRange != null) __obj.updateDynamic("ServiceUpdateTimeRange")(ServiceUpdateTimeRange)
    if (!js.isUndefined(ShowNodeLevelUpdateStatus)) __obj.updateDynamic("ShowNodeLevelUpdateStatus")(ShowNodeLevelUpdateStatus)
    if (UpdateActionStatus != null) __obj.updateDynamic("UpdateActionStatus")(UpdateActionStatus)
    __obj.asInstanceOf[DescribeUpdateActionsMessage]
  }
}

