package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHostReservationsResult extends js.Object {
  /**
    * Details about the reservation's configuration.
    */
  var HostReservationSet: js.UndefOr[HostReservationSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeHostReservationsResult {
  @scala.inline
  def apply(HostReservationSet: HostReservationSet = null, NextToken: String = null): DescribeHostReservationsResult = {
    val __obj = js.Dynamic.literal()
    if (HostReservationSet != null) __obj.updateDynamic("HostReservationSet")(HostReservationSet)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeHostReservationsResult]
  }
}

