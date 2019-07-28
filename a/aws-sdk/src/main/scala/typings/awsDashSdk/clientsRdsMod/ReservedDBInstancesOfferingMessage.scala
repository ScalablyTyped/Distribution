package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedDBInstancesOfferingMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of reserved DB instance offerings.
    */
  var ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined
}

object ReservedDBInstancesOfferingMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedDBInstancesOfferings: ReservedDBInstancesOfferingList = null): ReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReservedDBInstancesOfferings != null) __obj.updateDynamic("ReservedDBInstancesOfferings")(ReservedDBInstancesOfferings)
    __obj.asInstanceOf[ReservedDBInstancesOfferingMessage]
  }
}

