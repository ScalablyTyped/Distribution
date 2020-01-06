package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedDBInstancesMessage extends js.Object {
  /**
    * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified DB instances class.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for this duration. Valid Values: 1 | 3 | 31536000 | 94608000 
    */
  var Duration: js.UndefOr[String] = js.native
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The lease identifier filter value. Specify this parameter to show only the reservation that matches the specified lease ID.  AWS Support might request the lease ID for an issue related to a reserved DB instance. 
    */
  var LeaseId: js.UndefOr[String] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that indicates whether to show only those reservations that support Multi-AZ.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * The offering type filter value. Specify this parameter to show only the available offerings matching the specified offering type. Valid Values: "Partial Upfront" | "All Upfront" | "No Upfront"  
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The product description filter value. Specify this parameter to show only those reservations matching the specified product description.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  /**
    * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that matches the specified reservation ID.
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  /**
    * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the specified offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.native
}

object DescribeReservedDBInstancesMessage {
  @scala.inline
  def apply(
    DBInstanceClass: String = null,
    Duration: String = null,
    Filters: FilterList = null,
    LeaseId: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    ReservedDBInstanceId: String = null,
    ReservedDBInstancesOfferingId: String = null
  ): DescribeReservedDBInstancesMessage = {
    val __obj = js.Dynamic.literal()
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (LeaseId != null) __obj.updateDynamic("LeaseId")(LeaseId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (ReservedDBInstanceId != null) __obj.updateDynamic("ReservedDBInstanceId")(ReservedDBInstanceId.asInstanceOf[js.Any])
    if (ReservedDBInstancesOfferingId != null) __obj.updateDynamic("ReservedDBInstancesOfferingId")(ReservedDBInstancesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedDBInstancesMessage]
  }
}

