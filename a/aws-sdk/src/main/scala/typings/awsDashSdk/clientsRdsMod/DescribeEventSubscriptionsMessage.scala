package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventSubscriptionsMessage extends js.Object {
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The name of the RDS event notification subscription you want to describe.
    */
  var SubscriptionName: js.UndefOr[String] = js.native
}

object DescribeEventSubscriptionsMessage {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    SubscriptionName: String = null
  ): DescribeEventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (SubscriptionName != null) __obj.updateDynamic("SubscriptionName")(SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventSubscriptionsMessage]
  }
}

