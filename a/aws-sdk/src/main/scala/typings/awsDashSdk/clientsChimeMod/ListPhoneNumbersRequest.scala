package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPhoneNumbersRequest extends js.Object {
  /**
    * The filter to use to limit the number of results.
    */
  var FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined
  /**
    * The value to use for the filter.
    */
  var FilterValue: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.undefined
}

object ListPhoneNumbersRequest {
  @scala.inline
  def apply(
    FilterName: PhoneNumberAssociationName = null,
    FilterValue: String = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    ProductType: PhoneNumberProductType = null,
    Status: PhoneNumberStatus = null
  ): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    if (FilterName != null) __obj.updateDynamic("FilterName")(FilterName.asInstanceOf[js.Any])
    if (FilterValue != null) __obj.updateDynamic("FilterValue")(FilterValue)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
}

