package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHostReservationOfferingsRequest extends js.Object {
  /**
    * One or more filters.    instance-family - The instance family of the offering (for example, m4).    payment-option - The payment option (NoUpfront | PartialUpfront | AllUpfront).  
    */
  var Filter: js.UndefOr[FilterList] = js.undefined
  /**
    * This is the maximum duration of the reservation to purchase, specified in seconds. Reservations are available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 94608000 for three years.
    */
  var MaxDuration: js.UndefOr[Integer] = js.undefined
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[DescribeHostReservationsMaxResults] = js.undefined
  /**
    * This is the minimum duration of the reservation you'd like to purchase, specified in seconds. Reservations are available in one-year and three-year terms. The number of seconds specified must be the number of seconds in a year (365x24x60x60) times one of the supported durations (1 or 3). For example, specify 31536000 for one year.
    */
  var MinDuration: js.UndefOr[Integer] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the reservation offering.
    */
  var OfferingId: js.UndefOr[String] = js.undefined
}

object DescribeHostReservationOfferingsRequest {
  @scala.inline
  def apply(
    Filter: FilterList = null,
    MaxDuration: js.UndefOr[Integer] = js.undefined,
    MaxResults: js.UndefOr[DescribeHostReservationsMaxResults] = js.undefined,
    MinDuration: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    OfferingId: String = null
  ): DescribeHostReservationOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxDuration)) __obj.updateDynamic("MaxDuration")(MaxDuration)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (!js.isUndefined(MinDuration)) __obj.updateDynamic("MinDuration")(MinDuration)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId)
    __obj.asInstanceOf[DescribeHostReservationOfferingsRequest]
  }
}

