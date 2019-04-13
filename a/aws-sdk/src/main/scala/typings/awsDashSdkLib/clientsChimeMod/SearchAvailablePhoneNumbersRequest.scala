package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAvailablePhoneNumbersRequest extends js.Object {
  /**
    * The area code used to filter results.
    */
  var AreaCode: js.UndefOr[String] = js.undefined
  /**
    * The city used to filter results.
    */
  var City: js.UndefOr[String] = js.undefined
  /**
    * The country used to filter results.
    */
  var Country: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The state used to filter results.
    */
  var State: js.UndefOr[String] = js.undefined
}

object SearchAvailablePhoneNumbersRequest {
  @scala.inline
  def apply(
    AreaCode: String = null,
    City: String = null,
    Country: String = null,
    MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined,
    NextToken: String = null,
    State: String = null
  ): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    if (AreaCode != null) __obj.updateDynamic("AreaCode")(AreaCode)
    if (City != null) __obj.updateDynamic("City")(City)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
}

