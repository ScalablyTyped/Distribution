package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCapacityReservationsResult extends js.Object {
  /**
    * Information about the Capacity Reservations.
    */
  var CapacityReservations: js.UndefOr[CapacityReservationSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeCapacityReservationsResult {
  @scala.inline
  def apply(CapacityReservations: CapacityReservationSet = null, NextToken: String = null): DescribeCapacityReservationsResult = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservations != null) __obj.updateDynamic("CapacityReservations")(CapacityReservations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeCapacityReservationsResult]
  }
}

