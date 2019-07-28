package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePendingMaintenanceActionsMessage extends js.Object {
  /**
    * A filter that specifies one or more resources to return pending maintenance actions for. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs). The results list will only include pending maintenance actions for the DB clusters identified by these ARNs.    db-instance-id - Accepts DB instance identifiers and DB instance ARNs. The results list will only include pending maintenance actions for the DB instances identified by these ARNs.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribePendingMaintenanceActions request. If this parameter is specified, the response includes only records beyond the marker, up to a number of records specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The ARN of a resource to return pending maintenance actions for.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.undefined
}

object DescribePendingMaintenanceActionsMessage {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ResourceIdentifier: String = null
  ): DescribePendingMaintenanceActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (ResourceIdentifier != null) __obj.updateDynamic("ResourceIdentifier")(ResourceIdentifier)
    __obj.asInstanceOf[DescribePendingMaintenanceActionsMessage]
  }
}

