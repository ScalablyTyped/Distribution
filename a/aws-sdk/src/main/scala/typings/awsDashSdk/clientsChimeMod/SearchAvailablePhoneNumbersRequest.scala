package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAvailablePhoneNumbersRequest extends js.Object {
  /**
    * The area code used to filter results.
    */
  var AreaCode: js.UndefOr[String] = js.native
  /**
    * The city used to filter results.
    */
  var City: js.UndefOr[String] = js.native
  /**
    * The country used to filter results.
    */
  var Country: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The state used to filter results.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The toll-free prefix that you use to filter results.
    */
  var TollFreePrefix: js.UndefOr[typings.awsDashSdk.clientsChimeMod.TollFreePrefix] = js.native
}

object SearchAvailablePhoneNumbersRequest {
  @scala.inline
  def apply(
    AreaCode: String = null,
    City: String = null,
    Country: String = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    State: String = null,
    TollFreePrefix: TollFreePrefix = null
  ): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    if (AreaCode != null) __obj.updateDynamic("AreaCode")(AreaCode.asInstanceOf[js.Any])
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TollFreePrefix != null) __obj.updateDynamic("TollFreePrefix")(TollFreePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
}

