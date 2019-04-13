package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHostReservationOfferingsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the offerings.
    */
  var OfferingSet: js.UndefOr[HostOfferingSet] = js.undefined
}

object DescribeHostReservationOfferingsResult {
  @scala.inline
  def apply(NextToken: String = null, OfferingSet: HostOfferingSet = null): DescribeHostReservationOfferingsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OfferingSet != null) __obj.updateDynamic("OfferingSet")(OfferingSet)
    __obj.asInstanceOf[DescribeHostReservationOfferingsResult]
  }
}

