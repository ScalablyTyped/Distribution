package typings.awsSdk

import typings.awsSdk.dmsMod.FilterList
import typings.awsSdk.dmsMod.IntegerOptional
import typings.awsSdk.dmsMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/dms.DescribeEndpointsMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeEndpointsMessagew extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Filters applied to the describe action. Valid filter names: endpoint-arn | endpoint-type | endpoint-id | engine-name
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}

object DescribeEndpointsMessagew {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | Double = null
  ): DescribeEndpointsMessagew = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsMessagew]
  }
}

