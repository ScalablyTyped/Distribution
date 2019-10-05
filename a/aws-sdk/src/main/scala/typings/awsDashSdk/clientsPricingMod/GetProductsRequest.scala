package typings.awsDashSdk.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProductsRequest extends js.Object {
  /**
    * The list of filters that limit the returned products. only products that match all filters are returned.
    */
  var Filters: js.UndefOr[typings.awsDashSdk.clientsPricingMod.Filters] = js.undefined
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The code for the service whose products you want to retrieve. 
    */
  var ServiceCode: js.UndefOr[String] = js.undefined
}

object GetProductsRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    FormatVersion: String = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    ServiceCode: String = null
  ): GetProductsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    __obj.asInstanceOf[GetProductsRequest]
  }
}

