package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostReservationsResult extends js.Object {
  /**
    * Details about the reservation's configuration.
    */
  var HostReservationSet: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.HostReservationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeHostReservationsResult {
  @scala.inline
  def apply(HostReservationSet: HostReservationSet = null, NextToken: String = null): DescribeHostReservationsResult = {
    val __obj = js.Dynamic.literal()
    if (HostReservationSet != null) __obj.updateDynamic("HostReservationSet")(HostReservationSet.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostReservationsResult]
  }
}

